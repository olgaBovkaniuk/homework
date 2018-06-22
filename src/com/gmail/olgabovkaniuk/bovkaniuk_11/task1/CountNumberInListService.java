package com.gmail.olgabovkaniuk.bovkaniuk_11.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberInListService {

    public void printCountedNumber(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }
        int maxElem = list.get(0);
        for (Integer integer : list) {
            if (maxElem < integer) {
                maxElem = integer;
            }
        }
        for (int i = 0; i <= maxElem; i++) {
            int count = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == i) {
                    count++;
                }
            }
            System.out.println("The amount of a number " + i + " is: " + count);
        }
    }
}
