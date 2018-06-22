package com.gmail.olgabovkaniuk.bovkaniuk_11.task3;

// if you want to generate list of Persons using console line, use this class

import com.gmail.olgabovkaniuk.util.RandomService;
import com.gmail.olgabovkaniuk.util.ScannerService;

import java.util.ArrayList;
import java.util.List;

public class GenerateListService {
    private static final int YEAR_OF_BIRTH_FROM = 1990;
    private static final int YEAR_OF_BIRTH_TO = 2000;
    private ScannerService scannerService = new ScannerService();
    private RandomService random = new RandomService();

    public List<Person> getList() {
        List<Person> personList = new ArrayList<>();
        System.out.println("Please, enter map size: ");
        int size = scannerService.getNumber();
        for (int i = 0; i < size; i++) {
            System.out.println("Please, enter name and surname: ");
            personList.add(i, new Person(scannerService.getString(), scannerService.getString(), random.getRandomNumber(YEAR_OF_BIRTH_FROM, YEAR_OF_BIRTH_TO)));
        }
        return personList;
    }
}
