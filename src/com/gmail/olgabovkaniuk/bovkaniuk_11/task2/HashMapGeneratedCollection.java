package com.gmail.olgabovkaniuk.bovkaniuk_11.task2;

// if you want to generate map of strings using console line, use this class

import com.gmail.olgabovkaniuk.util.ScannerService;

import java.util.HashMap;
import java.util.Map;

public class HashMapGeneratedCollection {
    private ScannerService scannerService = new ScannerService();

    public void printMapKey() {
        Map<String, String> stringMap = new HashMap<>();
        System.out.println("Please, enter map size: ");
        int size = scannerService.getNumber();
        for (int i = 0; i < size; i++) {
            System.out.println("Please, enter a key and a value: ");
            stringMap.put(scannerService.getString(), scannerService.getString());
        }
        System.out.println("The keys: ");
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
