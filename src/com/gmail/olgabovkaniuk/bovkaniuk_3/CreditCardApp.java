package com.gmail.olgabovkaniuk.bovkaniuk_3;

public class CreditCardApp {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1, 95.5);
        CreditCard creditCard2 = new CreditCard(2, 100.0);
        CreditCard creditCard3 = new CreditCard(3, 73.7);

        creditCard1.charge(15.5);
        creditCard2.charge(25.6);
        creditCard3.writeOff(13.7);

        creditCard1.currentAccountInfo();
        creditCard2.currentAccountInfo();
        creditCard3.currentAccountInfo();
    }
}
