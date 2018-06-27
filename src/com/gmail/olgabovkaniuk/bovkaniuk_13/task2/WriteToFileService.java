package com.gmail.olgabovkaniuk.bovkaniuk_13.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileService {
    public void writeToFile(int n) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("text1.txt"))) {
            while (n > 0) {
                System.out.println("Please, enter a number: ");
                int number = scanner.nextInt();
                String string = String.valueOf(number);
                bw.write(string);
                bw.write(", ");
                n--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
