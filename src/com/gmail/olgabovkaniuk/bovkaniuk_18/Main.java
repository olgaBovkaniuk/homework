package com.gmail.olgabovkaniuk.bovkaniuk_18;

/*
        1. Написать программу, которая генерирует пул из 5 потоков.
            Запустить 5 потоков, которые генерируют строку длинной от 5 до 10
            из символов 'b', ‘v’, ‘x’.
            Вывести на экран все строки максимальной длины.

        2. Написать программу по шаблону "Производитель-Потребитель" для двух производителей
            (которые генерируют произвольное целое число каждые пол секунды)
            и двух потребителей.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_18.task1.RunTaskService;
import com.gmail.olgabovkaniuk.bovkaniuk_18.task2.Consumer;
import com.gmail.olgabovkaniuk.bovkaniuk_18.task2.NumberStorage;
import com.gmail.olgabovkaniuk.bovkaniuk_18.task2.Producer;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.task1();

        app.task2();
    }

    private void task1() {
        RunTaskService runTaskService = new RunTaskService();
        runTaskService.runTask("b", "v", "x", 5, 10, 5);
        System.out.println("----------------------------------------");
    }

    private void task2() {
        NumberStorage numberStorage = new NumberStorage();
        Runnable producer = new Producer(numberStorage, 20);
        Runnable producer2 = new Producer(numberStorage, 10);
        Runnable consumer = new Consumer(numberStorage);
        Runnable consumer2 = new Consumer(numberStorage);
        Thread threadProducer = new Thread(producer);
        Thread threadProducer2 = new Thread(producer2);
        Thread threadConsumer = new Thread(consumer);
        Thread threadConsumer2 = new Thread(consumer2);
        threadProducer.setName("Producer1");
        threadProducer.start();
        threadProducer2.setName("Producer2");
        threadProducer2.start();
        threadConsumer.setName("Consumer1");
        threadConsumer.start();
        threadConsumer2.setName("Consumer2");
        threadConsumer2.start();
    }
}
