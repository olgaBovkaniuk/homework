package com.gmail.olgabovkaniuk.util;

import java.util.Scanner;

public class ScannerService {

    private static final Scanner scanner = new Scanner(System.in);

    public int getNumber() {

        int number = scanner.nextInt();
        scanner.nextLine();
        return number;

    }

    public String getString() {

        return scanner.nextLine();

    }
}
