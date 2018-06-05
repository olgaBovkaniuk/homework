package com.gmail.olgabovkaniuk.bovkaniuk_4;
/*
﻿1. Создать два одноменых массива из 4 элементов.
   Заполнить их целыми числами.
   Создать третий массив, который будет содержать все элементы созданных массивов.
2. Написать метод, который определяет количество дней в году. В високосном годе - 366 дней,
   тогда как в обычном 365. Високосными годами являются все года делящиеся нацело на 4 за
   исключением столетий, которые не делятся нацело на 400.
3. Напишите метод, который в зависимости от значения числа( от 1 до 4) выводит на экран
   соответсвующую пору года.
*/

public class Main {
    public static void main(String[] args) {
        int[] first  = {1, 2, 3, 4};
        int[] second = {5, 6, 7, 8};
        testCopyingArrays(first, second);

        Year year1 = new Year(2300);
        year1.numberOfDaysInYear();

        Year year2 = new Year(1962);
        year2.numberOfDaysInYear();

        Year year3 = new Year(2020);
        year3.numberOfDaysInYear();

        seasonsOfYear(1);
        seasonsOfYear(2);
        seasonsOfYear(3);
        seasonsOfYear(4);
        seasonsOfYear(5);
    }

    public static void testCopyingArrays(int[] firstArray, int[] secondArray) {
        int[][] result = createTwoDimensionalArray(firstArray, secondArray);

        System.out.println(result[0][0] + " " + result[0][1] + " " + result[0][2] + " " + result[0][3]);
        System.out.println(result[1][0] + " " + result[1][1] + " " + result[1][2] + " " + result[1][3]);
    }

    public static int[][] createTwoDimensionalArray (int[] firstRow, int[] secondRow) {
        int[][] twoDimensionalArray = new int[2][firstRow.length];
        twoDimensionalArray[0] = firstRow;
        twoDimensionalArray[1] = secondRow;
        return twoDimensionalArray;
    }

    public static void seasonsOfYear(int numberOfSeason) {
        switch (numberOfSeason) {
            case 1:
                System.out.println("The season of the year is SUMMER!");
                break;
            case 2:
                System.out.println("The season of the year is AUTUMN!");
                break;
            case 3:
                System.out.println("The season of the year is WINTER!");
                break;
            case 4:
                System.out.println("The season of the year is SPRING!");
                break;
            default:
                System.out.println("The number isn't match the seasons of the year.");
        }
    }
}
