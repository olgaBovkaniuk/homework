package com.gmail.olgabovkaniuk.bovkaniuk_18.task2;

import java.util.Random;

public class Producer implements Runnable {
    private final NumberStorage numberStorage;
    private int range;
    private final Random random = new Random();

    public Producer(NumberStorage numberStorage, int range) {
        this.numberStorage = numberStorage;
        this.range = range;
    }

    private int generateInt(int range) {
        return random.nextInt(range);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberStorage.setNumber(generateInt(range));
        }
    }
}
