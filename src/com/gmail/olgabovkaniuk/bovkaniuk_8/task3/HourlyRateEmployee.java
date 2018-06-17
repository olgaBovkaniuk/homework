package com.gmail.olgabovkaniuk.bovkaniuk_8.task3;

import java.math.BigDecimal;

public class HourlyRateEmployee extends Employee {

    public HourlyRateEmployee(String name, String lastName, String position, String department) {
        super(name, lastName, position, department);
    }

    public BigDecimal calculateSalary(int workedHours) {
        this.totalSalary = BigDecimal
                .valueOf(MONTHLY_RATE)
                .divide(BigDecimal.valueOf(HOURS_IN_MONTH))
                .multiply(BigDecimal.valueOf(workedHours));
        return totalSalary;
    }

    public void personInfo() {
        super.personInfo();
    }

    public void paymentInfo() {
        System.out.println("Hourly rate employee payment is: " + totalSalary);
    }
}
