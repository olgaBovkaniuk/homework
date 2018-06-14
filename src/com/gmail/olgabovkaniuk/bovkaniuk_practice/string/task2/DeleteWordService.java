package com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task2;

//      2. Удалить из строки все слова, длина которых меньше пяти символов. В строке не используются знаки препинания.

public class DeleteWordService {

    public String deleteWordLessThanFiveChar(String str, int wordLength) {
        String[] strings = str.split("\\s");
        String newString = "";
        for (String string : strings) {
            if (string.length() < wordLength) {
                string = "";
            }
            newString += string + " ";
        }
        return newString;
    }
}
