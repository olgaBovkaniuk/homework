package com.gmail.olgabovkaniuk.control_workk;

/*
        Создать с помощью Java файл из 10 студентов (номер, имя, курс, группа (все рандомно, на ваше усмотрение)).
        Вывести его содержимое на экран.
        Предусмотреть при чтении ситуацию, когда порядок колонок неизвестен.
*/

import com.gmail.olgabovkaniuk.control_workk.task6.StudentFileService;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.task6();

    }

    private void task6() {
        StudentFileService studentFileService = new StudentFileService();
        studentFileService.writeFile();
        studentFileService.readFile();
    }
}
