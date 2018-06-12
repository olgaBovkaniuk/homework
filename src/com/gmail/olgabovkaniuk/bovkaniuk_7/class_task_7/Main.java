package com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7;
/*
      1. Удалить в строке все цифры.
      2. В заданной строке подсчитать количество цифр 9.
      3. Ввести массив строк и найти в нем максимальную по длине строку.
           a) Не учитывать случай, когда таких строк несколько
           b) Если строка с максимальной длиной не одна, вывести все.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task1.DeleteDigitInStringService;
import com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task2.CountDigitInStringService;
import com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task3.MaxStringInArrayService;
import com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task3.StringArrayGeneratorService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DeleteDigitInStringService deleteDigit = new DeleteDigitInStringService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a string: ");
        String newString = deleteDigit.deleteDigitInString(scanner);
        System.out.println("String after deleting digits: " + newString);
        System.out.println("----------------------------------------");

        CountDigitInStringService countDigit = new CountDigitInStringService();
        System.out.println("Please, enter a string: ");
        System.out.println("The number of digits is: " + countDigit.countDigit(scanner));
        System.out.println("----------------------------------------");

        StringArrayGeneratorService arrayGeneratorService = new StringArrayGeneratorService();
        String[] stringsArray = arrayGeneratorService.stringArrayGenerator(scanner);
        MaxStringInArrayService maxStringInArrayService = new MaxStringInArrayService();
        System.out.println("Max element in array: ");
        maxStringInArrayService.printMaxElemInArray(stringsArray);
        System.out.println("All max elements in array: ");
        maxStringInArrayService.printAllMaxElemInArray(stringsArray);

    }
}
