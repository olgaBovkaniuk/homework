package com.gmail.olgabovkaniuk.control_work2.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteToFileRunnable implements Runnable {
    private final Random random = new Random();
    private int arrayLength;
    private int fileNameCounter;

    public WriteToFileRunnable(int arrayLength, int fileNameCounter) {
        this.arrayLength = arrayLength;
        this.fileNameCounter = fileNameCounter;
    }

    public void writeToFile(int[] ints) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("arrayWithMaxElem%d.txt", fileNameCounter)))) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int anInt : ints) {
                stringBuilder.append(String.valueOf(anInt));
                stringBuilder.append(", ");
            }
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private int[] generateIntArrayAndAddMaxElem() {
        int[] ints = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            ints[i] = random.nextInt(50);
        }
        int maxElem = getMaxElemFromArray(ints);
        return arrayWithAddedMaxElem(ints, maxElem);
    }

    private int getMaxElemFromArray(int[] ints) {
        int maxElem = 0;
        for (int anInt : ints) {
            maxElem = Math.max(maxElem, anInt);
        }
        return maxElem;
    }

    private int[] arrayWithAddedMaxElem(int[] ints, int maxElem) {
        int[] intsWithMax = new int[ints.length + 1];
        for (int i = 0; i < intsWithMax.length; i++) {
            if (i < ints.length) {
                intsWithMax[i] = ints[i];
            } else {
                intsWithMax[i] = maxElem;
            }
        }
        return intsWithMax;
    }

    @Override
    public void run() {
        writeToFile(generateIntArrayAndAddMaxElem());
    }
}
