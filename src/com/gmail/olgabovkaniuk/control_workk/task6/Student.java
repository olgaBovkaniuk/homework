package com.gmail.olgabovkaniuk.control_workk.task6;

import java.util.Objects;

public class Student {
    private String number;
    private String name;
    private String course;
    private String group;

    public Student(String number, String name, String course, String group) {
        this.number = number;
        this.name = name;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return number + " " + name + " " + course + " " + group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(number, student.number) &&
                Objects.equals(name, student.name) &&
                Objects.equals(course, student.course) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, name, course, group);
    }
}
