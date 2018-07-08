package com.gmail.olgabovkaniuk.bovkaniuk_17.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriteRunnable implements Runnable {
    private int countNumbersInLine;
    private int linesInFile;
    private final Random random = new Random();

    public FileWriteRunnable(int countNumbersInLine, int linesInFile) {
        this.countNumbersInLine = countNumbersInLine;
        this.linesInFile = linesInFile;
    }

    public List<String> generateNumberString() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < linesInFile; i++) {
            String string = "";
            for (int j = 0; j < countNumbersInLine; j++) {
                String integer = String.valueOf(random.nextInt(50));
                if (j == countNumbersInLine - 1) {
                    string += integer;
                } else {
                    string += integer + ", ";
                }
            }
            stringList.add(string);
        }
        return stringList;
    }

    public void writeToFile(List<String> stringList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("stringsOfNumbers.txt"))) {
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        writeToFile(generateNumberString());
    }
}
