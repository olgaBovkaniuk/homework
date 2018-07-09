package com.gmail.olgabovkaniuk.bovkaniuk_18.task2;

public class Consumer implements Runnable {
    private final NumberStorage numberStorage;

    public Consumer(NumberStorage numberStorage) {
        this.numberStorage = numberStorage;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + ", Got number: " + numberStorage.getNumber());
        }
    }
}
