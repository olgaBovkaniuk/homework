package com.gmail.olgabovkaniuk.control_work2.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingletonService {
    private static TestSingletonService instance = null;

    private TestSingletonService() {};

    public static TestSingletonService getInstance() {
        if (instance == null) {
            instance = new TestSingletonService();
        }
        return instance;
    }

    public List<String> runWriteToFileThreads(int numberOfThreads, int listLength) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<String>> futureList = new ArrayList<>();
        for (int i = 0; i < numberOfThreads; i++) {
            Future<String> future = executorService.submit(new WriteToFileCallable(listLength, i));
            futureList.add(future);
        }
        List<String> stringListOfFileNames = new ArrayList<>();
        for (Future<String> future : futureList) {
            try {
                stringListOfFileNames.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
        executorService.shutdown();
        return stringListOfFileNames;
    }

    public List<Integer> runReadFromFileThreads(List<String> stringList, int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<Integer>> futureList = new ArrayList<>();
        for (String string : stringList) {
            Future<Integer> future = executorService.submit(new ReadFromFileCallable(string));
            futureList.add(future);
        }
        List<Integer> integerList = new ArrayList<>();
        for (Future<Integer> future : futureList) {
            try {
                integerList.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
        executorService.shutdown();
        return integerList;
    }

    public void averageMaxElemFromFiles(List<Integer> integerList) {
        if (integerList != null) {
            int sum = 0;
            int count = 0;
            for (Integer integer : integerList) {
                sum += integer;
                count++;
            }
            System.out.println("Average of max elements is: " + sum / count);
        } else {
            System.out.println("List of integers if empty!");
        }
    }
}
