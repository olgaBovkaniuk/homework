package com.gmail.olgabovkaniuk.bovkaniuk25.sqlcommands;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WriteToFileService {
    private final Random random = new Random();

    public void writeToFile(String fileName,
                            String dbName,
                            String tableEmployeeName,
                            int salaryFrom,
                            int salaryTo,
                            int numberOfRows,
                            int salaryFromMiddle,
                            int salaryToMiddle,
                            int salaryFromSenior,
                            int salaryForDelete) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
            bufferedWriter.write(createDB(dbName));
            bufferedWriter.write(createEmployeeTable(tableEmployeeName));
            List<Employee> employeeList = generateEmployeeList(numberOfRows, salaryFrom, salaryTo);
            for (Employee employee : employeeList) {
                bufferedWriter.write(insertIntoEmployeeTable(employee, tableEmployeeName));
            }
            bufferedWriter.write(updateEmployeeTableForMiddle(tableEmployeeName, salaryFromMiddle, salaryToMiddle));
            bufferedWriter.write(updateEmployeeTableForSenior(tableEmployeeName, salaryFromSenior));
            bufferedWriter.write(deleteEmployeesFromTable(tableEmployeeName, salaryForDelete));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String createDB(String dbName) {
        return String.format("CREATE DATABASE %s;\n", dbName);
    }

    private String createEmployeeTable(String tableName) {
        return String.format("CREATE TABLE %s (id INT(11) NOT NULL PRIMARY KEY, first_name VARCHAR(50) NULL, last_name VARCHAR(50) NULL, salary INT NULL, title VARCHAR(15) NOT NULL);\n", tableName);
    }

    private String insertIntoEmployeeTable(Employee employee, String tableName) {
        return String.format("INSERT INTO %s (id, first_name, last_name, salary, title_enum) VALUES (%d, '%s', '%s', %d, '%s');\n", tableName, employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getSalary(), employee.getTitle());
    }

    private String updateEmployeeTableForMiddle(String tableName, int salaryFrom, int salaryTo) {
        return String.format("UPDATE %s SET title = \"%s\" WHERE salary > %d AND salary < %d;\n", tableName, TitleEnum.MIDDLE, salaryFrom, salaryTo);
    }

    private String updateEmployeeTableForSenior(String tableName, int salary) {
        return String.format("UPDATE %s SET title = \"%s\" WHERE salary > %d;\n", tableName, TitleEnum.SENIOR, salary);
    }

    private String deleteEmployeesFromTable(String tableName, int salary) {
        return String.format("DELETE FROM %s WHERE salary < %d;\n", tableName, salary);
    }

    private List<Employee> generateEmployeeList(int numberOfRowToInsert, int salaryFrom, int salaryTo) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < numberOfRowToInsert; i++) {
            employeeList.add(Employee.newEmployeeBuilder()
                    .id(i)
                    .firstName(("FirstName") + i)
                    .lastName(("LastName") + i)
                    .salary(random.nextInt(salaryTo - salaryFrom + 1) + salaryFrom)
                    .title(TitleEnum.JUNIOR)
                    .build());
        }
        return employeeList;
    }
}
