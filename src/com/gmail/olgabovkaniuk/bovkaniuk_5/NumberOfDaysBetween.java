package com.gmail.olgabovkaniuk.bovkaniuk_5;

public class NumberOfDaysBetween {
    private int startYear;
    private int endYear;

    public NumberOfDaysBetween(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public void numberOfDaysInYear () {
        int leapYear    = 366;
        int notLeapYear = 365;
        for (int i = startYear; i <= endYear; i++) {
            if (i % 100 == 0 && i % 400 != 0) {
                System.out.println("The year " + i + " is a not leap year and contains " + notLeapYear + " days.");
            } else if (i % 4 == 0) {
                System.out.println("The year " + i + " is a leap year and contains " + leapYear + " days.");
            } else {
                System.out.println("The year " + i + " is not a leap year and contains " + notLeapYear + " days.");
            }
        }
        System.out.println("--------------------------------------------");
    }
}
