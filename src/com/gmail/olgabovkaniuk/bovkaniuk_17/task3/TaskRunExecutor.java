package com.gmail.olgabovkaniuk.bovkaniuk_17.task3;

import java.util.List;
import java.util.concurrent.*;

public class TaskRunExecutor {

    public void runTask(int countNumbersInLine, int linesInFile, int threadPerLinesNumber) {
        FileWriteRunnable fileService = new FileWriteRunnable(countNumbersInLine, linesInFile);
        Thread thread = new Thread(fileService);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findMAxElemFromResult(threadPerLinesNumber);
    }

    private void findMAxElemFromResult(int threadPerLinesNumber) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<List<Future<Integer>>> listCallable = new FileReadCallable("stringsOfNumbers.txt", threadPerLinesNumber);
        try {
            List<Future<Integer>> futureList = executorService.submit(listCallable).get();
            Integer maxElem = futureList.get(0).get();
            for (Future<Integer> future : futureList) {
                System.out.println("Sum from thread: " + future.get());
                if (future.get() > maxElem) {
                    maxElem = future.get();
                }
            }
            System.out.println("Max sum is: " + maxElem);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
