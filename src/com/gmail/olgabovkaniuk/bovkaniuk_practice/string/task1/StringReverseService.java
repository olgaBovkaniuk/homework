package com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task1;

//      1. Вводится строка слов. Вывести слова в обратном порядке.

public class StringReverseService {

    public String stringReverse(String str) {
        String[] strings = str.split("\\s");
        String newString = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            newString += strings[i] + " ";
        }
        return newString;
    }
}
