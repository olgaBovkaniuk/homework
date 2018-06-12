package com.gmail.olgabovkaniuk.bovkaniuk_7.task2;

/*
        2. Ввести n строк с консоли. Вывести на консоль те строки, в которых встречается слово cat или dog.
           Подсчитать длину этих строк. Вывести на экран количество строк, которые не соответствуют критерию.
*/

import java.util.Scanner;

public class StringService {

    public void dogCatString(Scanner scanner, String str1, String str2) {

        int numberString = scanner.nextInt();
        scanner.nextLine(); // to prevent empty line

        String[] array = new String[numberString];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter a string: ");
            array[i] = scanner.nextLine();
        }

        System.out.println();

        int count = 0;
        for (String str : array) {
            if (str.contains(str1) || str.contains(str2)) {
                System.out.println(str);
                System.out.println("The length of this string is: " + str.length());
            } else {
                count++;
            }
        }
        System.out.println("Strings that do not contain words " + str1 + " or " + str2 + " : " + count);
    }
}
