package com.gmail.olgabovkaniuk.bovkaniuk_6;

//2. Введите число с клавиатуры. Подсчитайте количество цифр и сумму этих цифр и выведите на экран.

import java.util.Scanner;

public class CountNumberInDigitService {

    public void countNumberInDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int number = scanner.nextInt();
        int length = (int) (Math.log10(number) + 1);
        System.out.println("Length of number " + number + " is " + length);

        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("Summary of all numbers in digit is " + sum);
    }
}
