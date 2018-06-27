package com.gmail.olgabovkaniuk.bovkaniuk_13.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IntParserService {
    public void readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            List<Integer> integerList = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                if (!line.trim().isEmpty()) {
                    parseLine(integerList, line);
                }
                line = br.readLine();
            }
            System.out.println("List is " + integerList);
            findAndPrintMinElem(integerList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void parseLine(List<Integer> integers, String line) {
        String[] arrayValues = line.split(",");
        for (String val : arrayValues) {
            try {
                integers.add(Integer.valueOf(val.trim()));
            } catch (NumberFormatException e) {
                System.out.println("Symbol '" + val.trim() + "' is incorrect. Can't be converted to Integer.");
            }
        }
    }

    private void findAndPrintMinElem(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) {
            return;
        }
        int minElement = integers.get(0);
        for (Integer integer : integers) {
            if (minElement > integer) {
                minElement = integer;
            }
        }
        System.out.println("Min element is: " + minElement);
    }
}
