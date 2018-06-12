package com.gmail.olgabovkaniuk.bovkaniuk_7;

/*
        ﻿1. Ввести с консоли строку. Показать номера символов, совпадающих с последним символом строки.
        2. Ввести n строк с консоли. Вывести на консоль те строки, в которых встречается слово cat или dog.
           Подсчитать длину этих строк. Вывести на экран количество строк, которые не соответствуют критерию.
        3. Ввести с консоли строку в программу:
           "На вопрос "Откуда?" - От верблюда! На вопрос "Зачем?" - Затем! На вопрос "Что?"- Цирк Шапито! На вопрос "Как?"- На тебя напал столбняк!"
           Во введенной строке удалить пробелы между вторым и третьим вопросительным знаком.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_7.task1.CharacterOfStringService;
import com.gmail.olgabovkaniuk.bovkaniuk_7.task2.StringService;
import com.gmail.olgabovkaniuk.bovkaniuk_7.task3.StringManipulationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CharacterOfStringService stringService = new CharacterOfStringService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any string: ");
        stringService.characterOfString(scanner);
        System.out.println("---------------------------------");

        System.out.println("Please, enter number of strings: ");
        StringService stringService1 = new StringService();
        stringService1.dogCatString(scanner, "cat", "dog");
        System.out.println("---------------------------------");

        StringManipulationService manipulationService = new StringManipulationService();
        System.out.println("Please, enter a string: ");
        String string = scanner.nextLine();
        System.out.println(manipulationService.deleteGapsInString(string));

    }
}
