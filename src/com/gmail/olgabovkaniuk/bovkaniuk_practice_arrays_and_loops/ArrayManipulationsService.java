package com.gmail.olgabovkaniuk.bovkaniuk_practice_arrays_and_loops;
/*
        1. Напишите метод, который генерирует массив целых чисел длиной n и увеличивает заданный элемент массива на 10%.
        2. Напишите метод, который генерирует массив целых чисел длиной n. Пользователь вводит целое число.
           Найти, содержит ли данный массив это число. Если содержит, то вывести сумму вcех чисел,
           расположенных до первого найденного значений и сумму всех чисел, расположенный после первого найденного.
           Вывести на экран эти суммы, в противном случае вывести сообщение "Нет".
        3. Напишите метод, который генерирует массив целых чисел длиной n.
           Вывести на экран второй максимальный элемент в этом массиве.
        4. Написать метод, который генерирует 2 массива целых чисел длиной n.
           В первом массиве найти минимальный элемент и вывести на экран из второго массива соответствующий элемент
           для позиции минимального элемента из первого массива.
*/

import java.util.Random;

public class ArrayManipulationsService {

// task 1

    public int[] incrementsElemOfArray(int arraySize, int elemIndex) {
        if (arraySize < 0) {
            System.out.println("Array size should be positive");
            return null;
        }

        System.out.println("Array before: ");

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 100;
            System.out.print(" " + array[i]);
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i == elemIndex) {
                array[i] = array[i] + (array[i] / 100) * 10;
            }
        }

        System.out.println("Array after: ");

        for (int anArray : array) {
            System.out.print(" " + anArray);
        }

        System.out.println();
        System.out.println("----------------------------------------------");

        return array;
    }

// task 2

    public void ifArrayContainsElement(int arraySize, int elem) {
        if (arraySize < 0) {
            System.out.println("Array size should be positive");
            return;
        }

        System.out.println("Array: ");

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(" " + array[i]);
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {

                int sumOfElementsBeforeElem = 0;
                for (int j = 0; j < i; j++) {
                    sumOfElementsBeforeElem += array[j];
                }

                System.out.println("Summary of elements of the array before given element is " + sumOfElementsBeforeElem);

                int sumOfElementsAfterElem = 0;
                for (int j = array.length - 1; j > i; j--) {
                    sumOfElementsAfterElem += array[j];
                }

                System.out.println("Summary of elements of the array after given element is " + sumOfElementsAfterElem);
                break;
            }
            if (i == array.length - 1) {
                System.out.println("Nope.");
            }
        }
        System.out.println("----------------------------------------------");
    }

// task 3

    public void secondMaxElem(int arraySize) {
        if (arraySize < 0) {
            System.out.println("Array size should be positive");
            return;
        }

        int[] array = new int[arraySize];

        final Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = i * random.nextInt(8);
            System.out.print(" " + array[i]);
        }

        System.out.println();

        int maxElem = -2147483648; // minimum int value
        int secondMaxElem = -2147483648;
        for (int anArray : array) {
            if (maxElem < anArray) {
                secondMaxElem = maxElem;
                maxElem = anArray;
            } else if (secondMaxElem < anArray) {
                secondMaxElem = anArray;
            }
        }

        System.out.println("The second max element in the array is " + secondMaxElem);

        System.out.println("----------------------------------------------");
    }

// task 4

    public void elemPositionInArray(int arraySize) {
        if (arraySize < 0) {
            System.out.println("Array size should be positive");
            return;
        }

        int[] array = new int[arraySize];
        int[] array1 = new int[arraySize];

        final Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(" " + array[i]);
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
            System.out.print(" " + array1[i]);
        }
        System.out.println();

        int minElem = 2147483647; // maximum int value
        int indexOfMinElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (minElem > array[i]) {
                minElem = array[i];
                indexOfMinElem = i;
            }
        }

        System.out.println("The min element in the array is " + minElem);
        System.out.println("The index of min element in the array is " + indexOfMinElem);
        System.out.println("The element by index of min element from the first array from the second array is " + array1[indexOfMinElem]);
    }
}
