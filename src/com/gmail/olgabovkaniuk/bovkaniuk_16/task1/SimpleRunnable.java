package com.gmail.olgabovkaniuk.bovkaniuk_16.task1;

import java.util.Random;

public class SimpleRunnable implements Runnable {
    private final Random random = new Random();

    private int[] generateIntArray(int arrayLength) {
        int[] ints = new int[arrayLength];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        return ints;
    }

    private int findMaxElemInArray(int[] ints) {
        int maxElem = ints[0];
        for (int elem : ints) {
            if (elem > maxElem) {
                maxElem = elem;
            }
        }
        return maxElem;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Max element in array is: " + findMaxElemInArray(generateIntArray(10)));
    }
}
