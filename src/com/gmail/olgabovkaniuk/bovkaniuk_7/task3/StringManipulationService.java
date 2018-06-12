package com.gmail.olgabovkaniuk.bovkaniuk_7.task3;

/*
        3. Ввести с консоли строку в программу:
           "На вопрос "Откуда?" - От верблюда! На вопрос "Зачем?" - Затем! На вопрос "Что?"- Цирк Шапито! На вопрос "Как?"- На тебя напал столбняк!"
           Во введенной строке удалить пробелы между вторым и третьим вопросительным знаком.
*/

import java.util.Scanner;

public class StringManipulationService {

    public String deleteGapsInString(String str) {
        String[] array = str.split("\\?");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + "?";
            if (i == 2) {
                array[i] = array[i].replaceAll("\\s", "");
                break;
            }
        }

        int i = 1;
        String newString = array[0];
        while (i < array.length) {
            newString += array[i];
            i++;
        }

        return newString;
    }
}
