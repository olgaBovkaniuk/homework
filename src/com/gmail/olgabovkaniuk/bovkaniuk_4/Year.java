package com.gmail.olgabovkaniuk.bovkaniuk_4;

public class Year {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    public void numberOfDaysInYear() {
        int leapYear    = 366;
        int notLeapYear = 365;
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("The year " + year + " is a not leap year and contains " + notLeapYear + " days.");
        } else if (year % 4 == 0) {
            System.out.println("The year " + year + " is a leap year and contains " + leapYear + " days.");
        } else {
            System.out.println("The year " + year + " is not a leap year and contains " + notLeapYear + " days.");
        }
    }
}
