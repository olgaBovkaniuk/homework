package com.gmail.olgabovkaniuk.bovkaniuk_5;

public class NumbersOperations {
    private int startNumber;
    private int endNumber;

    public NumbersOperations(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    public void squaresOfNumbers () {
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print("Square of number " + i + " is: ");
            int result = i;
            result *= i;
            System.out.println(result);
        }
        System.out.println("--------------------------------------------");
    }

    public void naturalNumbersPrint () {
        System.out.println("Numbers between " + startNumber + " and " + endNumber + " : ");
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 3 == 0 && i % 5 !=0) {
                System.out.print(" " + i);
            }
        }
    }
}
