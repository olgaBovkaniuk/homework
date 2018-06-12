package com.gmail.olgabovkaniuk.bovkaniuk_7.task1;

//  ﻿1. Ввести с консоли строку. Показать номера символов, совпадающих с последним символом строки.

import java.util.Scanner;

public class CharacterOfStringService {

    public void characterOfString(Scanner scanner) {

        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("The last symbol in the string is: " + arr[arr.length - 1]);
        System.out.println("Character numbers that match the last character in the string: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1]) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }


}
