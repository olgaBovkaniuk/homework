package com.gmail.olgabovkaniuk.bovkaniuk_19.class_task;

/*
        1. Создайте TxtReader, PropertiesReader, XmlReader, которые реализуют
        интерфейс TextReader.
            Написать метод read() в интерфейсе и его имплементации в
        реализующих его классах, который возвращает строку-сообщение о
        чтении соответствующим TextReader.
            Создать фабрику, которая возвращает необходимый тип TextReader в
        зависимости от типа файла(.xml, .properties, .txt).
            Сделать фабрику синглетоном.
            Создать класс Course который содержит 5 любых полей с билдером и
        сделать его неизменяемым
*/

import com.gmail.olgabovkaniuk.bovkaniuk_19.class_task.task1.TextReaderFactorySingleton;

import java.io.File;

public class Main {
    private static File file = new File("xml.xml");
    private static File file1 = new File("properties.properties");
    private static File file2 = new File("txt.txt");

    public static void main(String[] args) {
        TextReaderFactorySingleton factorySingleton = TextReaderFactorySingleton.getInstance();
        System.out.println(factorySingleton.getReader(file).read());
        System.out.println(factorySingleton.getReader(file1).read());
        System.out.println(factorySingleton.getReader(file2).read());
    }
}
