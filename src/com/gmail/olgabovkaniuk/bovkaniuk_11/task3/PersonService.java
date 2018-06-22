package com.gmail.olgabovkaniuk.bovkaniuk_11.task3;

import java.util.List;

public class PersonService {

    public void personInfo(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                Person person1 = list.get(j);
                Person person2 = list.get(j + 1);
                if (person1.compare(person2) > 0) {
                    list.set(j, person2);
                    list.set(j + 1, person1);
                }
            }
        }
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
