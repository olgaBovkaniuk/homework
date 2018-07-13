package com.gmail.olgabovkaniuk.bovkaniuk_19.task2;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String lastName;
    private String firstName;
    private int yearOfBirth;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Person(String lastName, String firstName, int yearOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
    }

    private Person(PersonBuilder personBuilder) {
        firstName = personBuilder.firstName;
        lastName = personBuilder.lastName;
        yearOfBirth = personBuilder.yearOfBirth;
    }

    public static PersonBuilder newPersonBuilder() {
        return new PersonBuilder();
    }

    @Override
    public int compareTo(Person o) {
        if (this.yearOfBirth > o.yearOfBirth) {
            return 1;
        } else if (this.yearOfBirth == o.yearOfBirth) {
            return 0;
        }
        return -1;
    }

    public static final class PersonBuilder {
        private String lastName;
        private String firstName;
        private int yearOfBirth;

        private PersonBuilder() {
        }

        public PersonBuilder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public PersonBuilder withLastName(String val) {
            lastName = val;
            return this;
        }

        public PersonBuilder withYearOfBirth(int val) {
            yearOfBirth = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(lastName, firstName, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
