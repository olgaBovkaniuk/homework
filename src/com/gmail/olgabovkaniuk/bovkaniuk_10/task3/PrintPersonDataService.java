package com.gmail.olgabovkaniuk.bovkaniuk_10.task3;

import java.util.List;

public class PrintPersonDataService {

    public void print(List<Person> personList) {
        for (Person person : personList) {
            if (person.getAge() >= 18) {
                System.out.printf("Adult: name %s, surname %s, age %d %n", person.getName(), person.getSurname(), person.getAge());
            } else {
                System.out.printf("Infant: name %s, surname %s, age %d %n", person.getName(), person.getSurname(), person.getAge());
            }
        }
    }
}

