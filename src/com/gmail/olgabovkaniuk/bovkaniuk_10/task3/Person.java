package com.gmail.olgabovkaniuk.bovkaniuk_10.task3;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        if (age >= 18) {
            return String.format("Adult: name %s, surname %s, age %d %n", name, surname, age);
        }
        return String.format("Infant: name %s, surname %s, age %d %n", name, surname, age);
    }
}
