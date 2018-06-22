package com.gmail.olgabovkaniuk.bovkaniuk_11.task3;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Person(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }


    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public int compare(Person other) {
        if (this.yearOfBirth > other.getYearOfBirth()) {
            return 1;
        } else if (this.yearOfBirth == other.getYearOfBirth()) {
            return compareFullName(other);
        }
        return -1;
    }

    private int compareFullName(Person other) {
        if (this.surname.charAt(0) > other.getSurname().charAt(0)) {
            return 1;
        } else if (this.getSurname().charAt(0) == other.getSurname().charAt(0)) {
            if (this.name.charAt(0) > other.getName().charAt(0)) {
                return 1;
            }
        }
        return -1;
    }
}
