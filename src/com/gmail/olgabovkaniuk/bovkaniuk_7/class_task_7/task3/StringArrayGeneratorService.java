package com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task3;

import java.util.Scanner;

public class StringArrayGeneratorService {

    public String [] stringArrayGenerator(Scanner scanner) {
        System.out.println("Please, enter array length: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // to prevent empty line
        String[] stringArray = new String[length];

        for (int i =0; i < stringArray.length; i++) {
            System.out.println("Please, enter a string: ");
            stringArray[i] = scanner.nextLine();
        }
        System.out.println();

        System.out.println("Array is: ");
        for (String string: stringArray) {
            System.out.print(" | " + string);
        }
        System.out.println();

        return stringArray;
    }
}
