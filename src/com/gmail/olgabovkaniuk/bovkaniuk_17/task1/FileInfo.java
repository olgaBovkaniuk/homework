package com.gmail.olgabovkaniuk.bovkaniuk_17.task1;

public class FileInfo {
    private Integer size;

    public synchronized void setSize(Integer size) {
        this.size = size;
        if (size != null) {
            this.notify();
        }
        System.out.println("Current size is: " + size);
    }

    public synchronized Integer getSize() {
        while (size == null) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return size;
    }
}
