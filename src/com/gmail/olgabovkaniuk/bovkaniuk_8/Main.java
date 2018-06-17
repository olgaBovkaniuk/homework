package com.gmail.olgabovkaniuk.bovkaniuk_8;

/*
        1. Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
            Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
            Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.

        2. Создать класс Automobile. Сделать его абстрактным.
            Добавить в класс абстрактный метод  int getRate().
            Добавить в класс метод String getDescription(), который возвращает строку "Automobile: ".
            Создать класс RussianAutomobile, который наследуется от Automobile.
            Создать класс GermanyAutomobile, который наследуется от Automobile.
            Cоздать класс EnglandAutomobile, который наследуется от Automobile.
            В каждом из классов написать свою реализацию метода getRate.
            Метод должен возвращать рейтинг автомобиля в зависимости от типа.
            В каждом из классов написать свою реализацию метода getDescription.
            Методы должны возвращать строку вида: <getDescription() родительского класса>  + <" Моя страна - Sssss.
            Рейтинг автомобиля N">, где Sssss - название страны, где N - рейтинг автомобиля

        3. Разработать программу для формирования платежной ведомости на предприятии.
            a)Предусмотреть 4 типа сотрудников в зависимости от варианта расчета заработной платы:
                месячная ставка
                почасовая оплата
                % от объема продаж
                базовая месячная ставка + % от объема продаж
            b)Для каждого сотрудника хранить имя, фамилию, информацию о должности (наименование,отдел)

        4. Создать классы "Директор", "Рабочий", "Бухгалтер".
            Реализовать интерфейс с методом, который печатает название должности и имплементировать этот метод в созданные классы.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_8.task1.Circle;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task1.Figure;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task1.Rectangle;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task1.Triangle;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task2.Automobile;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task2.EnglandAutomobile;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task2.GermanyAutomobile;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task2.RussianAutomobile;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task3.*;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task4.Accountant;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task4.Director;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task4.EmployeePositionInfo;
import com.gmail.olgabovkaniuk.bovkaniuk_8.task4.Worker;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        task1();

        task2();

        task3();

        task4();

    }

    private static void task1() {

        Figure triangle = new Triangle(1, 2, 3);
        Figure triangle2 = new Triangle(4, 5, 6);
        Figure rectangle = new Rectangle(5, 5);
        Figure rectangle2 = new Rectangle(2, 6);
        Figure circle = new Circle(2);

        Figure[] figures = {triangle, triangle2, rectangle, rectangle2, circle};

        double resultAllPerimeters = 0;
        for (Figure figure: figures) {
            resultAllPerimeters += figure.perimeter();
            System.out.println("Perimeter of figure: " + figure.perimeter());
        }
        System.out.println("Summary of all perimeters is: " + resultAllPerimeters);
        System.out.println("-----------------------------------------");

    }

    private static void task2() {

        Automobile automobile1 = new RussianAutomobile();
        Automobile automobile2 = new GermanyAutomobile();
        Automobile automobile3 = new EnglandAutomobile();

        System.out.println(automobile1.getDescription() + " Rate is " + automobile1.getRate());
        System.out.println(automobile2.getDescription() + " Rate is " + automobile2.getRate());
        System.out.println(automobile3.getDescription() + " Rate is " + automobile3.getRate());
        System.out.println("-----------------------------------------");

    }

    private static void task3() {


        Employee employee = new MonthlyRateEmployee("Mark", "Smith", "Financial analyst", "Financial department");
        employee.calculateSalary(320);

        Employee employee1 = new HourlyRateEmployee("Alice", "Munk", "Audit Manager", "Management");
        employee1.calculateSalary(20);

        Employee employee2 = new PercentOfSalesEmployee("Nik", "Wild", "Business Banking Officer", "Management", BigDecimal.valueOf(42.5));

        Employee employee3 = new BaseMonthlyAndPercentOfSalesEmployee("Laura", "Berry", "Anti-Money Laundering Auditor", "Audit", BigDecimal.valueOf(70.7));
        employee3.calculateSalary(250);

        Employee[] employees = {employee, employee1, employee2, employee3};

        for (Employee empl : employees) {
            empl.personInfo();
            empl.paymentInfo();
            System.out.println("------------------");
        }

        System.out.println("-----------------------------------------");

    }

    private static void task4() {

        EmployeePositionInfo[] employees = {new Director(), new Worker(), new Accountant()};
        for (EmployeePositionInfo positionInfo : employees) {
            positionInfo.printPositionInfo();
        }

    }
}
