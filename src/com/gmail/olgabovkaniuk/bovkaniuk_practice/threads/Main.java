package com.gmail.olgabovkaniuk.bovkaniuk_practice.threads;

/*
       1. Создать и запустить поток, который генерирует коллекцию из 100 произвольных целых чисел.
                Создать 4 потока, которые находят максимальный элемент в диапазоне 10 позиций из коллекции.
                Вывести на экран сумму максимальных элементов.

        2. Напишите программу, которая создает поток (назовем его Thread 1).
                Thread 1 создает другой поток (Thread 2); Thread 2 создает Thread 3; и т. д., вплоть до Thread 50.
                Каждый поток должен печатать «Hello from Thread <num>!»,
                но вы должны структурировать свою программу таким образом,
                чтобы потоки печатали свои приветствия в обратном порядке.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_practice.threads.task2.TaskRun;

public class Main {
    public static void main(String[] args) {
        TaskRun taskRun = new TaskRun();
        taskRun.runTask(50);
    }
}
