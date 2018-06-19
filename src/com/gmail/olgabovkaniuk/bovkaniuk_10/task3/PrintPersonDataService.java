package com.gmail.olgabovkaniuk.bovkaniuk_10.task3;

import java.util.List;

public class PrintPersonDataService {

    public void print(List<Person> personList) {

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
