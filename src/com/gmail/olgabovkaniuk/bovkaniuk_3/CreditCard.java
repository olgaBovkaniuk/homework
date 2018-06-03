package com.gmail.olgabovkaniuk.bovkaniuk_3;

public class CreditCard {
    private int accountNumber;
    private double currentAmount;

    public CreditCard(int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void charge(double chargeSum) {
        currentAmount += chargeSum;
    }

    public void writeOff(double writeOffSum) {
        currentAmount -= writeOffSum;
    }

    public void currentAccountInfo() {
        System.out.println("Account number is " + accountNumber);
        System.out.println("Current amount is " + currentAmount);
    }
}
