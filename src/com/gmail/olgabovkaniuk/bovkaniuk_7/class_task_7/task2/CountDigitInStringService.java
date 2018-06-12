package com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task2;

//   2. В заданной строке подсчитать количество цифр 9.

import java.util.Scanner;

public class CountDigitInStringService {

    public int countDigit(Scanner scanner) {
        String str = scanner.nextLine();
        System.out.println("Please, enter a digit you want to count: ");
        int digit = scanner.nextInt();

        int position = 0;
        int count = 0;
        while (position != -1) {
            position = str.indexOf(String.valueOf(digit), position);
            if (position == -1) {
                break;
            }
            position++;
            count++;
        }
      return count;
    }
}
