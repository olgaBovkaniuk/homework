package com.gmail.olgabovkaniuk.bovkaniuk_16.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileRunnable implements Runnable {
    private final Random random = new Random();

    private int[] generateIntArray(int arrayLength) {
        int[] ints = new int[arrayLength];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        return ints;
    }

    private void writeToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("intsArray_" + Thread.currentThread().getName() + ".txt"))) {
            int[] ints = generateIntArray(10);
            for (int elem : ints) {
                bufferedWriter.write(String.valueOf(elem));
                bufferedWriter.write(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        writeToFile();
    }
}
