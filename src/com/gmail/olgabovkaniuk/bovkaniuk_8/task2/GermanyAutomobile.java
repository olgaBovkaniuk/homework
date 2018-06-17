package com.gmail.olgabovkaniuk.bovkaniuk_8.task2;

public class GermanyAutomobile extends Automobile {
    private int rate = 2;

    public int getRate() {
        return rate;
    }

    public String getDescription() {
        String res = super.getDescription() + "Germany.";
        return res;
    }
}
