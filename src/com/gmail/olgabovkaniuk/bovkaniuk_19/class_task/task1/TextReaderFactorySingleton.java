package com.gmail.olgabovkaniuk.bovkaniuk_19.class_task.task1;

import java.io.File;

public class TextReaderFactorySingleton {
    private static TextReaderFactorySingleton instance = null;

    private TextReaderFactorySingleton() {
    }

    public static TextReaderFactorySingleton getInstance() {
        if (instance == null) {
            return instance = new TextReaderFactorySingleton();
        }
        return instance;
    }

    private String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
        return "";
    }

    public TextReader getReader(File file) {
        if (getFileExtension(file).equalsIgnoreCase("txt")) {
            return new TxtReader();
        } else if (getFileExtension(file).equalsIgnoreCase("properties")) {
            return new PropertiesReader();
        } else if (getFileExtension(file).equalsIgnoreCase("xml")) {
            return new XmlReader();
        }
        throw new RuntimeException("Reader is not founded for this type of file.");
    }
}
