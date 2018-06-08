package com.gmail.olgabovkaniuk.bovkaniuk_5;

/*
﻿        1. Определить количество дней в годах от 2000 до 2010 и вывести их на экран.
           В високосном годе - 366 дней, тогда как в обычном 365.
           Високосными годами являются все года делящиеся нацело на 4 за исключением столетий, которые не делятся нацело на 400.
        2. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        3. Даны натуральные числа от 20 до 50. Напечатать те из них, которые делятся на 3, но не делятся на 5.
*/

public class Main {
    public static void main(String[] args) {

        NumberOfDaysBetween daysBetween = new NumberOfDaysBetween(2000, 2010);
        daysBetween.numberOfDaysInYear();

        NumbersOperations numbersOperations = new NumbersOperations(10, 20);
        numbersOperations.squaresOfNumbers();

        NumbersOperations numbersOperations1 = new NumbersOperations(20, 50);
        numbersOperations1.naturalNumbersPrint();

    }
}
