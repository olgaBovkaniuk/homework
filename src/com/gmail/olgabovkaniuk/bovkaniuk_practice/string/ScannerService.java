package com.gmail.olgabovkaniuk.bovkaniuk_practice.string;

import java.util.Scanner;

public class ScannerService {

    public String scannerService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any string: ");
        String string = scanner.nextLine();
        return string;
    }
}
