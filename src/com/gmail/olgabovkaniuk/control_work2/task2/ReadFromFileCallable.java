package com.gmail.olgabovkaniuk.control_work2.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ReadFromFileCallable implements Callable<Integer> {
    private String fileName;

    public ReadFromFileCallable(String fileName) {
        this.fileName = fileName;
    }

    public List<Integer> readFromFile() {
        List<Integer> integerList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String string = bufferedReader.readLine();
            String[] strings = string.split(", ");
            for (String elem : strings) {
                integerList.add(Integer.valueOf(elem));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return integerList;
    }

    private Integer getMaxValueFromList(List<Integer> integerList) {
        Integer maxElem = integerList.get(0);
        for (Integer integer : integerList) {
            maxElem = Math.max(maxElem, integer);
        }
        return maxElem;
    }

    @Override
    public Integer call() throws Exception {
        return getMaxValueFromList(readFromFile());
    }
}
