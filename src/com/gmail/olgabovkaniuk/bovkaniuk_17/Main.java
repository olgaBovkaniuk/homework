package com.gmail.olgabovkaniuk.bovkaniuk_17;

/*
        1. Создать файл состоящий из 10 строк вида 'С:\WebServers\home\testsite\www\myfile.txt'.
            Выделите из этих строк имена файлов без расширения и запишите в другой файл в отдельном потоке,
            который вернет результирующий размер файла.

        2. Создать пул из 4 потоков. Создать класс потока,
            который генерирует коллекцию из 10 рандомных целых чисел и возвращает максимальный элемент.
            Подсчитать среднее арифметическое результата работы 10 потоков.

        3. В отдельном потоке создать файл состоящий из 1000 строк содержащих 4 произвольных целых числа,
            разделенных запятой.
            В другом потоке прочитать эти строки и на каждый массив из 10 строк запускать отдельный поток,
            который возвращает сумму всех чисел в этих строках.
            Найти максимальную сумму среди результатов работы всех предыдущих потоков.
*/

import com.gmail.olgabovkaniuk.bovkaniuk_17.task1.FileService;
import com.gmail.olgabovkaniuk.bovkaniuk_17.task2.MaxElemCallable;
import com.gmail.olgabovkaniuk.bovkaniuk_17.task3.TaskRunExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        app.test1();

        app.test2();

        app.test3();
    }

    private void test1() {
        FileService fileService = new FileService();
        fileService.writeToFile(10);
        fileService.writeToFileNames();
        System.out.println("-------------------------------------------------");
    }

    private void test2() {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<Integer>> list = new ArrayList<>();
        Callable<Integer> callable = new MaxElemCallable();
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executor.submit(callable);
            list.add(future);
        }
        Integer sum = 0;
        int count = 0;
        for (Future<Integer> future : list) {
            try {
                Integer integer = future.get();
                sum += integer;
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        double average = (double) sum / count;
        System.out.println("Average of max elements from all threads is: " + average);
        System.out.println("-------------------------------------------------");
    }

    private void test3() {
        TaskRunExecutor runExecutor = new TaskRunExecutor();
        runExecutor.runTask(4, 100, 10);
    }
}
