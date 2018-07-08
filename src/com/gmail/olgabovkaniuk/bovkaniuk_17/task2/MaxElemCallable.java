package com.gmail.olgabovkaniuk.bovkaniuk_17.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class MaxElemCallable implements Callable<Integer> {
    private final Random random = new Random();

    private List<Integer> generateIntList(int listLength) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            integerList.add(random.nextInt(100));
        }
        return integerList;
    }

    private Integer getMaxElemFromList(List<Integer> integerList) {
        Integer maxElem = integerList.get(0);
        for (Integer integer : integerList) {
            if (integer > maxElem) {
                maxElem = integer;
            }
        }
        return maxElem;
    }

    @Override
    public Integer call() {
        Integer elem = getMaxElemFromList(generateIntList(10));
        System.out.println("In thread " + Thread.currentThread().getName() + " Max element is: " + elem);
        return elem;
    }
}
