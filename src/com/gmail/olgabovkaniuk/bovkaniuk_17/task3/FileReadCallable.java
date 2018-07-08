package com.gmail.olgabovkaniuk.bovkaniuk_17.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FileReadCallable implements Callable<List<Future<Integer>>> {
    private final List<Future<Integer>> futureList = new ArrayList<>();
    private String nameOfFile;
    private int threadPerLinesNumber;

    public FileReadCallable(String nameOfFile, int threadPerLinesNumber) {
        this.nameOfFile = nameOfFile;
        this.threadPerLinesNumber = threadPerLinesNumber;
    }

    public List<String> readFromFile(int threadPerLinesNumber) {
        List<String> stringSubList = new ArrayList<>();
        int counter = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nameOfFile))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                if (counter != 0 && counter % threadPerLinesNumber == 0) {
                    runInSeparateThread(stringSubList);
                    stringSubList = new ArrayList<>();
                }
                stringSubList.add(line);
                line = bufferedReader.readLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!stringSubList.isEmpty()) {
            runInSeparateThread(stringSubList);
        }
        return stringSubList;
    }

    private void runInSeparateThread(List<String> stringList) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Integer> integerCallable = new SumOfIntCallable(stringList);
        Future<Integer> future = executorService.submit(integerCallable);
        futureList.add(future);
    }

    @Override
    public List<Future<Integer>> call() throws Exception {
        readFromFile(threadPerLinesNumber);
        return futureList;
    }
}
