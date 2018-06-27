package com.gmail.olgabovkaniuk.bovkaniuk_13;

/*
        1. Создать руками файл с массивом целых чисел.
           Прочитать из файлы данные, найти минимальный элемент и вывести его на экран.

        2. Создать средствами Java файл и записать в него массив из n элементов(ввести все с консоли) целых чисел.

        3. Создать руками файл с текстом.
           Из файла удалить все слова, содержащие от трех до пяти символов.
           Записать результат в другой файл который находится в другой директории средствами класса File.

*/

import com.gmail.olgabovkaniuk.bovkaniuk_13.task1.IntParserService;
import com.gmail.olgabovkaniuk.bovkaniuk_13.task2.WriteToFileService;
import com.gmail.olgabovkaniuk.bovkaniuk_13.task3.FileService;
import com.gmail.olgabovkaniuk.util.ScannerService;

public class Main {
    private static ScannerService scannerService = new ScannerService();

    public static void main(String[] args) {
        IntParserService parserService = new IntParserService();
        parserService.readFromFile();

        WriteToFileService writeToFile = new WriteToFileService();
        writeToFile.writeToFile(scannerService.getNumber());

        FileService fileService = new FileService();
        fileService.readFile();

    }
}
