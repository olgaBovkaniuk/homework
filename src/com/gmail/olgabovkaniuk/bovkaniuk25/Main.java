package com.gmail.olgabovkaniuk.bovkaniuk25;

/*
        1. С помощью Java сгенерировать файл, который содержит SQL команды
        2. Создать базу данных Office
        3. Создать таблицу
    public class Employee {
        private int id;
        private String firstName;
        private String lastName;
        private int salary;
        private TitleEnum title;
    }
    public enum TitleEnum{
        JUNIOR,
        MIDDLE,
        SENIOR
    }
        4. Добавить 10 записей с рандомными значениями. Зарплата в диапазоне 300-3000. Title по умолчанию JUNIOR.
        5. Обновить записи, зарплата которых от 1000-1500, поменяв title на MIDDLE
        6. Обновить записи, зарплата которых от от 1500, поменяв title на SENIOR
        7. Удалить записи, зарплата которых менее 700
*/

import com.gmail.olgabovkaniuk.bovkaniuk25.sqlcommands.WriteToFileService;

public class Main {
    public static void main(String[] args) {
        WriteToFileService writeToFileService = new WriteToFileService();
        String fileName = "SQLCommands";
        String dbName = "Office";
        String tableEmployeeName = "Employee";
        int salaryFrom = 300;
        int salaryTo = 3000;
        int numberOfRows = 10;
        int salaryFromMiddle = 1000;
        int salaryToMiddle = 1500;
        int salaryFromSenior = 1500;
        int salaryForDelete = 700;
        writeToFileService.writeToFile(fileName, dbName, tableEmployeeName, salaryFrom, salaryTo, numberOfRows, salaryFromMiddle, salaryToMiddle, salaryFromSenior, salaryForDelete);
    }
}
