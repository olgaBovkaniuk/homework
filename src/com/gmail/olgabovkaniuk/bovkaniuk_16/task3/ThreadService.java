package com.gmail.olgabovkaniuk.bovkaniuk_16.task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThreadService {
    private final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public synchronized void threadInfo() {
        Calendar cal = Calendar.getInstance();
        System.out.printf("Thread name: %s. Current time: %s \n", Thread.currentThread().getName(), dateFormat.format(cal.getTime()));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
