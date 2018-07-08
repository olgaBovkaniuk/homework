package com.gmail.olgabovkaniuk.bovkaniuk_practice.threads.task2;

public class ThreadRunnable implements Runnable {
    private Thread parentThread;

    public ThreadRunnable(Thread parentThread) {
        this.parentThread = parentThread;
    }

    @Override
    public void run() {
        System.out.println("Hello from Thread: " + parentThread.getName());
        parentThread.start();
    }
}
