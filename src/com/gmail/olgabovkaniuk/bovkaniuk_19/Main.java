package com.gmail.olgabovkaniuk.bovkaniuk_19;

/*
        1. Написать фабрику, которая, в зависимости от enum константы(ARRAY_LIST, LINKED_LIST)
        генерирует ListEnum коллекцию целых чисел из 50 элементов от нуля до 20,
        используя класс Random(). Выведите коллекцию на экран.

        2. Создайте неизменяемый класс Person с полями - имя, фамилия, год рождения при помощи builder для него.
        Создать 10 объектов этого типа с произвольными полями.
        Вывести на экран в порядке возрастания года рождения фамилии и имена людей.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_19.task1.CollectionFactory;
import com.gmail.olgabovkaniuk.bovkaniuk_19.task1.ListEnum;
import com.gmail.olgabovkaniuk.bovkaniuk_19.task2.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    private final Random random = new Random();

    public static void main(String[] args) {
        Main app = new Main();

        app.test1();

        app.test2();
    }

    private void test1() {
        CollectionFactory collectionFactory = new CollectionFactory();
        List<Integer> arrayList = collectionFactory.getCollection(ListEnum.ARRAY_LIST).generateCollection(50, 20, random);
        List<Integer> linkedList = collectionFactory.getCollection(ListEnum.LINKED_LIST).generateCollection(50, 20, random);
        System.out.println(arrayList);
        System.out.println(linkedList);
    }

    private void test2() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(Person.newPersonBuilder()
                    .withFirstName("Name" + i)
                    .withLastName("LastName" + i)
                    .withYearOfBirth(random.nextInt(1997 - 1988 + 1) + 1988)
                    .build());
        }
        Collections.sort(personList);
        for (int i = 0; i < 10; i++) {
            System.out.println(personList.get(i));
        }
    }
}
