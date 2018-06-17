package com.gmail.olgabovkaniuk.bovkaniuk_8.task3;

import java.math.BigDecimal;

public class BaseMonthlyAndPercentOfSalesEmployee extends MonthlyRateEmployee {
    private BigDecimal percentOfSales;
    private BigDecimal monthlySalary;

    public BaseMonthlyAndPercentOfSalesEmployee(String name, String lastName, String position, String department, BigDecimal percentOfSales) {
        super(name, lastName, position, department);
        this.percentOfSales = percentOfSales;
    }

    public BigDecimal getPercentOfSales() {
        return percentOfSales;
    }

    public BigDecimal calculateSalary(int workedHours) {
        monthlySalary = super.calculateSalary(workedHours);
        this.totalSalary = monthlySalary.add(percentOfSales);
        return totalSalary;
    }

    public void personInfo() {
        super.personInfo();
    }

    public void paymentInfo() {
        System.out.println("Monthly rate employee payment is: " + monthlySalary);
        System.out.println("Percent of sales employee payment is: " + percentOfSales);
        System.out.println("Base monthly and percent of sales employee payment is: " + totalSalary);
    }
}
