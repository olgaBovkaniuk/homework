package com.gmail.olgabovkaniuk.bovkaniuk_practice.string;

/*
        1. Вводится строка слов. Вывести слова в обратном порядке.
        2. Удалить из строки все слова, длина которых меньше пяти символов. В строке не используются знаки препинания.
        3. Дан массив слов. Заменить последние три символа слов, имеющих выбранную длину на символ "$".
        4. Добавить в строку пробелы после знаков препинания, если они там отсутствуют.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task1.StringReverseService;
import com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task2.DeleteWordService;
import com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task3.ChangeWordService;
import com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task3.StringArrayGeneratorService;
import com.gmail.olgabovkaniuk.bovkaniuk_practice.string.task4.AddGapsToStringService;

public class Main {
    public static void main(String[] args) {

        ScannerService scannerService = new ScannerService();
        StringReverseService stringReverseService = new StringReverseService();
        String st = scannerService.scannerService();
        String reversedString = stringReverseService.stringReverse(st);
        System.out.println(reversedString);
        System.out.println("----------------------------------------------------");

        DeleteWordService wordService = new DeleteWordService();
        String st1 = scannerService.scannerService();
        String deletedWordString = wordService.deleteWordLessThanFiveChar(st1, 5);
        System.out.println(deletedWordString);
        System.out.println("----------------------------------------------------");

        ChangeWordService changeWordService = new ChangeWordService();
        StringArrayGeneratorService arrayGeneratorService = new StringArrayGeneratorService();
        String[] str = changeWordService.changeLastThreeCharInWord(arrayGeneratorService.stringArrayGenerator(), 5, "$");
        for (String string : str) {
            System.out.print(string + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

        AddGapsToStringService gaps = new AddGapsToStringService();
        String st2 = scannerService.scannerService();
        String addedGaps = gaps.addGapsToString(st2);
        System.out.println(addedGaps);


    }
}
