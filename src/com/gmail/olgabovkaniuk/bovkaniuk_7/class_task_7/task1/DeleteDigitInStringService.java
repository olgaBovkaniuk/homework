package com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task1;

import java.util.Scanner;

//   1. Удалить в строке все цифры.

public class DeleteDigitInStringService {

    public String deleteDigitInString(Scanner scanner) {
        String newString = scanner.nextLine();
        newString = newString.replaceAll("\\d", "");
        return newString;
    }
}
