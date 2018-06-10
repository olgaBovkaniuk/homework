package com.gmail.olgabovkaniuk.bovkaniuk_6;

/*
    1. Вывести на экран результат выражения 2*2+4/2 при помощи класса
       BigInteger
    2. Введите число с клавиатуры. Подсчитайте количество цифр и сумму этих цифр и выведите на экран.
    3. Создайте массив из n случайных целых чисел из отрезка [m;p]. Выведите массив на экран.
       Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
       Все переменные вводятся с консоли.
    4. Создайте метод, который будет генерировать и
       выводить на экран целое псевдослучайное число из отрезка [-n;n]. Переменная n вводится с консоли.
*/

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class NumberOperationService {

    public void someCalculation() {
        BigInteger bigInteger1 = BigInteger.valueOf(2);
        BigInteger bigInteger2 = BigInteger.valueOf(4);
        BigInteger result = bigInteger1.multiply(bigInteger1).add(bigInteger2.divide(bigInteger1));
        System.out.println("2*2+4/2 = " + result);
    }

    public void countNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String numberAsString = scanner.next();
        int numberOfDigits = numberAsString.length();

        int sum = 0;
        for (char i : numberAsString.toCharArray()) {
            sum += Character.getNumericValue(i);
        }

        System.out.println("Number of digits in the number " + numberAsString + " is " + numberOfDigits + " and the summary of digits is " + sum);
    }

    public void evenNumbersInArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array min element: ");
        int m = scanner.nextInt();

        System.out.println("Enter array max element: ");
        int p = scanner.nextInt();

        Random rd = new Random();

        System.out.println("Array is: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(p - m) + m;
            System.out.print(" " + array[i]);
        }
        System.out.println();

        int count = 0;
        for (int a : array) {
            if (a % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers in array is: " + count);
    }

    public void generateNumberBetweenTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        Random rd = new Random();

        int number = rd.nextInt(n + n) - n;

        System.out.println("The random number from the range [-" + n + "; " + n + "] is: " + number);
    }
}
