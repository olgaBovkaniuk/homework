package com.gmail.olgabovkaniuk.bovkaniuk_practice.files;

/*
        1. Создать массив годов от 1960 до 1970.

        2. Создать файл, который имеет структуру:
            Имя|Фамилия|Год Рождения
            <Name + i> <Surname + i> <Year>
            где i - позиция до 7, Year - рандомный год из массива заданного выше,
            данные в строках разделены пробелами

            Создать соответствующий класс Person для строк с данными и распарсить файл в коллекцию.
            Вывести на экран человека с наибольшим годом рождения.

            Имя|Фамилия|Год Рождения
            Name1 Surname1 <Year>
            Name2 Surname2 <Year>
            Name3 Surname3 <Year>
            Name4 Surname4 <Year>
            Name5 Surname5 <Year>
            Name6 Surname6 <Year>
            Name7 Surname7 <Year>
*/

import com.gmail.olgabovkaniuk.bovkaniuk_practice.files.task1.PersonService;

public class Main {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.writeFile(personService.generatePersonList());
        personService.getPersonWithMaxYear();
    }
}
