package com.gmail.olgabovkaniuk.control_work2.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class WriteToFileCallable implements Callable<String> {
    private final Random random = new Random();
    private int listLength;
    private int fileNameCounter;

    public WriteToFileCallable(int listLength, int fileNameCounter) {
        this.listLength = listLength;
        this.fileNameCounter = fileNameCounter;
    }

    public String writeCollectionToFile(List<Integer> integerList) {
        String fileName = String.format("fileWithList%d.txt", fileNameCounter);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer integer : integerList) {
                stringBuilder.append(integer);
                stringBuilder.append(", ");
            }
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return fileName;
    }

    private List<Integer> generateIntList() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            integerList.add(random.nextInt(50));
        }
        return integerList;
    }

    @Override
    public String call() throws Exception {
        return writeCollectionToFile(generateIntList());
    }
}
