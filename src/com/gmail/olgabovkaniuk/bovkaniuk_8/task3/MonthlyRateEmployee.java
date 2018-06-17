package com.gmail.olgabovkaniuk.bovkaniuk_8.task3;

import java.math.BigDecimal;

public class MonthlyRateEmployee extends Employee {

    public MonthlyRateEmployee(String name, String lastName, String position, String department) {
        super(name, lastName, position, department);
    }

    public BigDecimal calculateSalary(int workedHours) {
        this.totalSalary = BigDecimal
                .valueOf(workedHours)
                .divide(BigDecimal.valueOf(HOURS_IN_MONTH))
                .multiply(BigDecimal.valueOf(MONTHLY_RATE));
        return totalSalary;
    }

    public void personInfo() {
        super.personInfo();
    }

    public void paymentInfo() {
        System.out.println("Monthly rate employee payment is: " + totalSalary);
    }
}
