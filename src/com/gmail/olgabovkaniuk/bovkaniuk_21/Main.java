package com.gmail.olgabovkaniuk.bovkaniuk_21;

/*
        1. Написать схему для данного файла

        2. Вывести на экран информацию о книгах.

        3. Посчитать количество элементов book и вычислить среднее арифметическое цены книг.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_21.saxParser.SaxParser;

public class Main {
    public static void main(String[] args) {
        SaxParser saxParser = new SaxParser();
        saxParser.saxParser();
    }
}
