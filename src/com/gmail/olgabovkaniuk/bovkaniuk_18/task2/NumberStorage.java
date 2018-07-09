package com.gmail.olgabovkaniuk.bovkaniuk_18.task2;

public class NumberStorage {
    private Integer number;

    public synchronized int getNumber() {
        while (this.number == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer gotNumber = number;
        number = null;
        notifyAll();
        return gotNumber;
    }

    public synchronized void setNumber(Integer number) {
        while (this.number != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        System.out.println(Thread.currentThread().getName() + ", Set number: " + number);
        notifyAll();
    }
}
