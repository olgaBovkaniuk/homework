package com.gmail.olgabovkaniuk.bovkaniuk_8.task3;

public class EmployeePosition {
    private String position;
    private String department;

    EmployeePosition(String position, String department) {
        this.position = position;
        this.department = department;
    }

    String info() {
        return "{" +
                "position='" + position + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
