package com.gmail.olgabovkaniuk.bovkaniuk_16;

/*
        1. Создать класс поток,
            который генерирует массив целых чисел из 10 элементов,
            затем находит максимальный элемент в этом массиве и выводит на экран в формате
            - имя потока: максимальный элемент.
            Запустить 10 потоков.

        2. Создать класс поток,
            который создает средствами Java файл и записать в него рандомно
            сгенерированный массив из 10 целых чисел.
            Запустить 5 потоков.

        3. Создать класс с синхронизированным методом,
            который выводит на экран имя текущего потока,
            текущее время и вызывает sleep на 5 секунд.
            Запустить 10 потоков, которые вызывают этот метод от созданного объекта.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_16.task1.SimpleRunnable;
import com.gmail.olgabovkaniuk.bovkaniuk_16.task2.FileRunnable;
import com.gmail.olgabovkaniuk.bovkaniuk_16.task3.PrintThreadInfoCommand;
import com.gmail.olgabovkaniuk.bovkaniuk_16.task3.ThreadService;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.test1();

        app.test2();

        app.test3();
    }


    private void test1() {
        for (int i = 0; i < 10; i++) {
            Thread simpleThread = new Thread(new SimpleRunnable());
            simpleThread.setName("Thread_" + i);
            simpleThread.start();
        }
    }

    private void test2() {
        for (int i = 0; i < 5; i++) {
            Thread fileThread = new Thread(new FileRunnable());
            fileThread.setName("Thread_" + i);
            fileThread.start();
        }
    }

    private void test3() {
        ThreadService threadService = new ThreadService();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new PrintThreadInfoCommand(threadService));
            thread.setName("Thread_" + i);
            thread.start();
        }
    }
}
