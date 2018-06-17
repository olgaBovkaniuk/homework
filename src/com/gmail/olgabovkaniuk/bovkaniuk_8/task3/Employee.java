package com.gmail.olgabovkaniuk.bovkaniuk_8.task3;

import java.math.BigDecimal;

public abstract class Employee {

    static final int HOURS_IN_MONTH = 160;
    static final double MONTHLY_RATE = 100.50; // $ USA

    private String name;
    private String lastName;
    private EmployeePosition employee;
    BigDecimal totalSalary;

    Employee(String name, String lastName, String position, String department) {
        this.employee = new EmployeePosition(position, department);
        this.name = name;
        this.lastName = lastName;
    }

    public abstract BigDecimal calculateSalary(int workedHours);

    public void personInfo() {
        System.out.println("EmployeePositionInfo{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employee=" + employee.info() +
                '}');
    }

    public abstract void paymentInfo();
}
