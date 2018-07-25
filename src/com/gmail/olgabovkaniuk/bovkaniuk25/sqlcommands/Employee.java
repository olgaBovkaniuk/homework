package com.gmail.olgabovkaniuk.bovkaniuk25.sqlcommands;

import java.util.Objects;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private int salary;
    private TitleEnum title;

    private Employee(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        salary = builder.salary;
        title = builder.title;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public TitleEnum getTitle() {
        return title;
    }

    public static Builder newEmployeeBuilder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                title == employee.title;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, salary, title);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", title=" + title +
                '}';
    }

    public static final class Builder {
        private long id;
        private String firstName;
        private String lastName;
        private int salary;
        private TitleEnum title;

        private Builder() {
        }

        public Builder id(long val) {
            id = val;
            return this;
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder salary(int val) {
            salary = val;
            return this;
        }

        public Builder title(TitleEnum val) {
            title = val;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
