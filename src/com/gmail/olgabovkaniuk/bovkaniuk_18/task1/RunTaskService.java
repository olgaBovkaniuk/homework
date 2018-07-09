package com.gmail.olgabovkaniuk.bovkaniuk_18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RunTaskService {

    public void runTask(String symbol1, String symbol2, String symbol3, int stringFrom, int stringTo, int numberOfThreads) {

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<StringBuffer>> futureList = new ArrayList<>();
        Callable<StringBuffer> callable = new GenerateStringCallable(symbol1, symbol2, symbol3, stringFrom, stringTo);
        for (int i = 0; i < 5; i++) {
            Future<StringBuffer> future = executorService.submit(callable);
            futureList.add(future);
        }
        try {
            printStringsWithMaxLength(futureList);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    private void printStringsWithMaxLength(List<Future<StringBuffer>> futureList) throws ExecutionException, InterruptedException {
        int maxStringLength = futureList.get(0).get().length();
        for (Future<StringBuffer> future : futureList) {
            if (future.get().length() > maxStringLength) {
                maxStringLength = future.get().length();
            }
        }
        for (Future<StringBuffer> future : futureList) {
            if (future.get().length() == maxStringLength) {
                System.out.println("String with max length is: " + future.get());
            }
        }
    }
}
