package com.gmail.olgabovkaniuk.bovkaniuk_practice.files.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonService {
    private Random random = new Random();

    public List<Person> generatePersonList() {
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            personList.add(new Person(
                    "Name" + i,
                    "Surname" + i,
                    getRandomYearFromArray(1960, 1970)
            ));
        }
        return personList;
    }

    private int getRandomYearFromArray(int fromYear, int toYear) {
        int arrayLength = toYear - fromYear;
        int[] years = new int[arrayLength + 1];
        for (int i = 0; i < years.length; i++) {
            years[i] = fromYear;
            fromYear++;
        }
        int yearIndex = random.nextInt(arrayLength);
        return years[yearIndex];
    }

    public void writeFile(List<Person> personList) {
        try (FileWriter fileWriter = new FileWriter("persons.txt")) {
            for (Person person : personList) {
                fileWriter.write(person.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Person> readAndParseFile() {
        List<Person> personList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("persons.txt"))) {
            String line = br.readLine();
            while (line != null) {
                String[] lineStrings = line.split(" ");
                personList.add(new Person(lineStrings[0], lineStrings[1], Integer.valueOf(lineStrings[2])));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Person person : personList) {
            System.out.println(person.toString());
        }
        return personList;
    }

    public void getPersonWithMaxYear() {
        List<Person> personList = readAndParseFile();
        int maxYear = personList.get(0).getYear();
        for (Person person : personList) {
            if (person.getYear() > maxYear) {
                maxYear = person.getYear();
            }
        }
        for (Person person : personList) {
            if (person.getYear() == maxYear) {
                System.out.println("Person with biggest year of birth is " + person.toString());
            }
        }
    }
}
