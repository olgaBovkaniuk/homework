package com.gmail.olgabovkaniuk.bovkaniuk_11;

/*
        1. Сгенерируйте List коллекцию целых чисел из 50 элементов от нуля до 20, используя класс Random().
        Oпределите количество каждого уникального числа c помощью Map.


        2. Создать коллекцию HashMap<String, String>, туда занести 10 различных строк как ключи и любое значение для ключа.
        Вывести на экран список ключей, каждый элемент с новой строки.

        3. Создайте класс Person с полями - имя, фамилия, год рождения.
        Создать 10 объектов этого типа.
        Вывести на экран в порядке возрастания года рождения фамилии и имена людей.
        Подумать о случае, когда нескольно людей будут иметь один и тот же год рождения.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_11.task1.CountNumberInListService;
import com.gmail.olgabovkaniuk.bovkaniuk_11.task2.HashMapCollection;
import com.gmail.olgabovkaniuk.bovkaniuk_11.task3.Person;
import com.gmail.olgabovkaniuk.bovkaniuk_11.task3.PersonService;
import com.gmail.olgabovkaniuk.util.GenerateCollectionService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private GenerateCollectionService collectionService = new GenerateCollectionService();

    public static void main(String[] args) {
        Main app = new Main();

//        app.test1();

//        app.test2();

        app.test3();

    }

    private void test1() {
        List<Integer> list = collectionService.generateIntCollection(0, 20);
        CountNumberInListService countNumberInListService = new CountNumberInListService();
        countNumberInListService.printCountedNumber(list);
        System.out.println("-------------------------");
    }

    private void test2() {
        HashMapCollection collection = new HashMapCollection();
        collection.printMapKey(getTest2Data());
        System.out.println("-------------------------");
    }

    private void test3() {
        PersonService personService = new PersonService();
        personService.personInfo(getTest3Data());
        System.out.println("-------------------------");
    }

    private static Map<String, String> getTest2Data() {
        Map<String, String> map = new HashMap<>();
        map.put("year", "Year");
        map.put("name", "Name");
        map.put("surname", "Surname");
        map.put("phone", "Phone");
        map.put("address", "Address");
        map.put("zip-code", "Zip-code");
        map.put("date", "Date");
        map.put("time", "Time");
        map.put("age", "Age");
        map.put("day", "Day");
        return map;
    }

    private static List<Person> getTest3Data() {
        List<Person> persons = new ArrayList<>(10);
        persons.add(new Person("Nikolas", "Smirnov", 1987));
        persons.add(new Person("Olga", "Malik", 1988));
        persons.add(new Person("Nik", "Beryzov", 1992));
        persons.add(new Person("Andrey", "Guba", 2001));
        persons.add(new Person("Nikol", "Burunduk", 1967));
        persons.add(new Person("Anna", "Kidman", 1967));
        persons.add(new Person("Tom", "Kykyryz", 1960));
        persons.add(new Person("Betsy", "Kim", 1960));
        persons.add(new Person("Rik", "Long", 1995));
        persons.add(new Person("Nikolas", "Smirnov", 1991));
        return persons;
    }
}

