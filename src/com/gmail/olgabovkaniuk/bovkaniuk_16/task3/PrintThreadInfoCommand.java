package com.gmail.olgabovkaniuk.bovkaniuk_16.task3;

public class PrintThreadInfoCommand implements Runnable {
    private final ThreadService threadService;

    public PrintThreadInfoCommand(ThreadService threadService) {
        this.threadService = threadService;
    }

    @Override
    public void run() {
        threadService.threadInfo();
    }
}
