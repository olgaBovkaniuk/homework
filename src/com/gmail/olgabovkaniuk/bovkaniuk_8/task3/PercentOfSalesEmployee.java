package com.gmail.olgabovkaniuk.bovkaniuk_8.task3;

import java.math.BigDecimal;

public class PercentOfSalesEmployee extends BaseMonthlyAndPercentOfSalesEmployee {

    public PercentOfSalesEmployee(String name, String lastName, String position, String department, BigDecimal percentOfSales) {
        super(name, lastName, position, department, percentOfSales);
    }

    public void personInfo() {
        super.personInfo();
    }

    public void paymentInfo() {
        System.out.println("Percent of sales employee payment is: " + getPercentOfSales());
    }

}
