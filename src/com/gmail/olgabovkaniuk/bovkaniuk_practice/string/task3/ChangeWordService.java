package com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task3;

//      3. Дан массив слов. Заменить последние три символа слов, имеющих выбранную длину на символ "$".

public class ChangeWordService {

    public String[] changeLastThreeCharInWord(String[] strings, int wordLength, String symbol) {
        String[] newArray = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() == wordLength) {
                newArray[i] = strings[i].substring(0, wordLength - 3) + symbol;
            } else {
                newArray[i] = strings[i];
            }
        }
        return newArray;
    }
}
