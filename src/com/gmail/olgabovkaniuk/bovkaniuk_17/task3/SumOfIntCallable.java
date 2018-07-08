package com.gmail.olgabovkaniuk.bovkaniuk_17.task3;

import java.util.List;
import java.util.concurrent.Callable;

public class SumOfIntCallable implements Callable<Integer> {
    private final List<String> strings;

    public SumOfIntCallable(List<String> strings) {
        this.strings = strings;
    }

    public Integer sumOfIntFromString(List<String> strings) {
        Integer sum = 0;
        for (String string : strings) {
            String[] integers = string.split(",");
            for (String integer : integers) {
                sum += Integer.valueOf(integer.trim());
            }
        }
        return sum;
    }

    @Override
    public Integer call() throws Exception {
        return sumOfIntFromString(strings);
    }
}
