package com.gmail.olgabovkaniuk.bovkaniuk_8.task2;

public class EnglandAutomobile extends Automobile {
    private int rate = 3;

    public int getRate() {
        return rate;
    }

    public String getDescription() {
        String res = super.getDescription() + "England.";
        return res;
    }
}
