package com.gmail.olgabovkaniuk.bovkaniuk_8.task2;

public class RussianAutomobile extends Automobile {
    private int rate = 1;

    public int getRate() {
        return rate;
    }

    public String getDescription() {
        String res = super.getDescription() + "Russia.";
        return res;
    }
}
