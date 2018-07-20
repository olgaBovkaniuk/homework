package com.gmail.olgabovkaniuk.control_work2.task1;

import com.gmail.olgabovkaniuk.bovkaniuk_17.task1.WriteFileRunnable;

import java.util.Scanner;

public class SingletonService {
    private static SingletonService instance = null;
    private final Scanner scanner = new Scanner(System.in);

   private SingletonService() {};

   public static SingletonService getInstance() {
       if (instance == null) {
           instance = new SingletonService();
       }
       return instance;
   }

    public void runThreads(int arrayLength) {
        System.out.println("Please, enter a number of threads you want to start: ");
        int numberOfThreads = scanner.nextInt();
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new WriteToFileRunnable(arrayLength, i));
            thread.start();
        }
    }
}
