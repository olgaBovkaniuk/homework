package com.gmail.olgabovkaniuk.bovkaniuk_10.task1;

import java.util.List;

public class FindMaxElemInListService {

    public void getTwoMaxElemInList(List<Integer> list) {
        Integer max = Integer.MIN_VALUE;
        Integer secondMax = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (secondMax < num) {
                secondMax = num;
            }
        }
        System.out.println("Max element in list is: "
                + max
                + " and second max element is: "
                + secondMax);
    }
}
