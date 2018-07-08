package com.gmail.olgabovkaniuk.bovkaniuk_practice.threads.task2;

public class TaskRun {
    public void runTask(int threadNumber) {
        Thread lastThread = new Thread();
        for (int i = 1; i <= threadNumber; i++) {
            lastThread.setName("" + i);
            ThreadRunnable threadRunnable = new ThreadRunnable(lastThread);
            Thread newThread = new Thread(threadRunnable);
            lastThread = newThread;
        }
        lastThread.start();
    }
}
