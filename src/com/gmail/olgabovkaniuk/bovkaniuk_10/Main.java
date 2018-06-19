package com.gmail.olgabovkaniuk.bovkaniuk_10;

/*﻿
        1. Заполнить коллекцию 10 рандомными целыми числами в промежутке от 2 до 98.
           Найти два максимальных элемента и вывести их на экран.

        2. Заполнить коллекцию 5 строками введенными с консоли.
           В каждой строке заменить "+" на "+++". Вывести коллекцию-результат на экран.

        3. Напишите класс Person, предоставляющий информацию о его имени getName(),
           фамилии методом getSurname() и возрасте getAge().
           Сгенерируйте группу из 20 человек в возрасте от 15 до 30.
           Если человек совершеннолетний, то вывести на экран информацию в формате
           "Adult: " + name + surname + age, если нет, то
           "Infant: " + name + surname + age.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_10.task1.FindMaxElemInListService;
import com.gmail.olgabovkaniuk.bovkaniuk_10.task2.ChangeSymbolInListStringService;
import com.gmail.olgabovkaniuk.bovkaniuk_10.task3.PrintPersonDataService;

public class Main {
    private GenerateCollectionService generateCollection = new GenerateCollectionService();

    public static void main(String[] args) {
        Main app = new Main();

        app.test1();

        app.test2();

        app.test3();

    }

    private void test1() {
        FindMaxElemInListService maxElemInListService = new FindMaxElemInListService();
        maxElemInListService.getTwoMaxElemInList(generateCollection.generateIntCollection(2, 98));
        System.out.println("--------------------------------------------");
    }

    private void test2() {
        ChangeSymbolInListStringService changeSymbol = new ChangeSymbolInListStringService();
        changeSymbol.getChangedString(generateCollection.generateStringCollection());
        System.out.println("--------------------------------------------");
    }

    private void test3() {
        PrintPersonDataService adultPersonService = new PrintPersonDataService();
        adultPersonService.print(generateCollection.generatePersonCollection());
        System.out.println("--------------------------------------------");
    }
}


