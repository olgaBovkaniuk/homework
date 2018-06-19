package com.gmail.olgabovkaniuk.bovkaniuk_10;

import com.gmail.olgabovkaniuk.bovkaniuk_10.task3.Person;

import java.util.ArrayList;
import java.util.List;

public class GenerateCollectionService {

    private static final int AGE_FROM = 15;
    private static final int AGE_TO = 30;
    private RandomService randomService = new RandomService();
    private ScannerService scannerService = new ScannerService();

    public List<Integer> generateIntCollection(int start, int end) {
        System.out.println("Please, enter list length: ");
        int listLength = scannerService.getNumber();
        List<Integer> list = new ArrayList<>(listLength);

        for (int i = 0; i < listLength; i++) {
            list.add(randomService.getRandomNumber(start, end));
        }

        System.out.println(list);

        return list;
    }

    public List<String> generateStringCollection() {
        System.out.println("Please, enter list length: ");
        int listLength = scannerService.getNumber();
        List<String> list = new ArrayList<>(listLength);

        for (int i = 0; i < listLength; i++) {
            System.out.println("Please, enter any string: ");
            list.add(scannerService.getString());
        }

        System.out.println(list);

        return list;
    }

    public List<Person> generatePersonCollection() {
        System.out.println("Please, enter list length: ");
        int listLength = scannerService.getNumber();
        List<Person> list = new ArrayList<>(listLength);

        for (int i = 0; i < listLength; i++) {
            System.out.println("Please, enter person name and surname: ");
            list.add(new Person(scannerService.getString(),
                                scannerService.getString(),
                                randomService.getRandomNumber(AGE_FROM, AGE_TO)));
        }

        return list;
    }
}
