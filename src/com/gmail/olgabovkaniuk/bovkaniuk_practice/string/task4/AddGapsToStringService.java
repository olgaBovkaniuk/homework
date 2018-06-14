package com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task4;

//      4. Добавить в строку пробелы после знаков препинания, если они там отсутствуют.

public class AddGapsToStringService {

    public String addGapsToString(String str) {

        String newString = str.replaceAll(",(?! )", ", ");
        return newString;
    }
}
