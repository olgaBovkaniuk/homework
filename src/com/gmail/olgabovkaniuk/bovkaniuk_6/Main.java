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

public class Main {
    public static void main(String[] args) {

        NumberOperationService numberCounterService = new NumberOperationService();

        numberCounterService.someCalculation();

        numberCounterService.countNumber();

        numberCounterService.evenNumbersInArray();

        numberCounterService.generateNumberBetweenTwo();
    }
}
