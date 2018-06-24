package com.gmail.olgabovkaniuk.bovkaniuk_12.task3;

import static com.gmail.olgabovkaniuk.bovkaniuk_12.task3.Volume.getVolume;

public class MediaBox {
    private Volume currentVolume = Volume.VOLUME_FIRST;
    private static final int ITER_STEP = 10;

    public void turnUp() {
        int value = currentVolume.getVolume() + ITER_STEP;
        try {
            currentVolume = getVolume(value);
            System.out.println("Current volume is turned UP and now it's: " + currentVolume.getVolume());
        } catch (RuntimeException e) {
            System.out.println("Already MAX volume! And it is: " + currentVolume.getVolume());
        }
    }

    public void turnDown() {
        int value = currentVolume.getVolume() - ITER_STEP;
        try {
            currentVolume = getVolume(value);
            System.out.println("Current volume is turned DOWN and now it's: " + currentVolume.getVolume());
        } catch (RuntimeException e) {
            System.out.println("Already MIN volume! And it is: " + currentVolume.getVolume());
        }
    }
}
