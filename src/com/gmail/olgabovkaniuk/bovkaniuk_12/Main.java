package com.gmail.olgabovkaniuk.bovkaniuk_12;

/*
        1. Сгенерировать код, который выбрасывает NullPointerException.
           Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание данного исключения.

        2. Сгенерировать код, который будет выбрасывать в секции try три различных собственных исключения,
           в зависимости от цифры(от 1 до 3), которую введет пользователь с клавиатуры.
           Выводит сообщение об ошибке на экран. Сделать программу бесконечной, пока пользователь не введет 0.

        3. Создать enum Volume.
           Определить в нем 3 уровня громкости с соответствующим полем описания.
           Написать класс MediaBox, который внутри себя будет хранить переменную, в которой будет хранится текущая громкость.
           Написать метод для увеличения и уменьшения громкости на 1 уровень. Отобразить работу программы на экран.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_12.task1.NullPointerExceptionService;
import com.gmail.olgabovkaniuk.bovkaniuk_12.task2.ExceptionService;
import com.gmail.olgabovkaniuk.bovkaniuk_12.task3.MediaBox;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.test1();
        app.test2();
        app.test3();
    }

    private void test1() {
        NullPointerExceptionService exception = new NullPointerExceptionService();
        exception.generateAndCatchNPE();
    }

    private void test2() {
        ExceptionService exceptionService = new ExceptionService();
        exceptionService.getException();
        System.out.println("------------------------------------------");
    }

    private void test3() {
        MediaBox mediaBox = new MediaBox();
        mediaBox.turnUp();
        mediaBox.turnUp();
        mediaBox.turnUp();
        mediaBox.turnDown();
        mediaBox.turnDown();
        mediaBox.turnDown();
    }
}
