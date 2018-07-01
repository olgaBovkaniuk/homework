package com.gmail.olgabovkaniuk.control_workk.task6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentFileService {
    private Random random = new Random();

    private List<Student> generateStudentList(int numberStudents, int from, int to) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= numberStudents; i++) {
            studentList.add(new Student(
                    "№" + i,
                    "Name" + i,
                    "Course_" + (random.nextInt(to - from + 1) + from),
                    "Group_" + (random.nextInt(to - from + 1) + from)
            ));
        }
        return studentList;
    }

    public void writeFile() {
        List<Student> studentList = generateStudentList(10, 1, 4);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("listOfStudents.txt"))) {
            for (Student student : studentList) {
                bufferedWriter.write(student.toString());
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("listOfStudents.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] strings = line.split(" ");
                String stringNumber = null;
                String stringName = null;
                String stringCourse = null;
                String stringGroup = null;
                for (String string : strings) {
                    if (string.startsWith("№")) {
                        stringNumber = string;
                    } else if (string.startsWith("Name")) {
                        stringName = string;
                    } else if (string.startsWith("Course_")) {
                        stringCourse = string;
                    } else if (string.startsWith("Group_")) {
                        stringGroup = string;
                    }
                }
                studentList.add(new Student(stringNumber, stringName, stringCourse, stringGroup));
                line = bufferedReader.readLine();
            }
            System.out.println(studentList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
