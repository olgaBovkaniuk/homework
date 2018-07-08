package com.gmail.olgabovkaniuk.bovkaniuk_17.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileRunnable implements Runnable {
    private final FileInfo fileInfo;
    private final List<String> namesList;

    public WriteFileRunnable(List<String> namesList, FileInfo fileInfo) {
        this.namesList = namesList;
        this.fileInfo = fileInfo;
    }

    public int writeToFileNamesAndGetFileSize() {
        int linesCount = 0;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fileNames.txt"))) {
            for (String string : namesList) {
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
                linesCount++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesCount;
    }

    @Override
    public void run() {
        fileInfo.setSize(writeToFileNamesAndGetFileSize());
    }
}
