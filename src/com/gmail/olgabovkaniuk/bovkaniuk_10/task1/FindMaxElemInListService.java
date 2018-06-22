package com.gmail.olgabovkaniuk.bovkaniuk_10.task1;

import java.util.List;

public class FindMaxElemInListService {
    public void getTwoMaxElemInList(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("List is empty. Do nothing!");
            return;
        }
        Integer maxEl = list.get(0);
        Integer secondMaxElem = list.get(0);
        for (Integer element : list) {
            if (element > maxEl) {
                secondMaxElem = maxEl;
                maxEl = element;
            } else if (secondMaxElem < element) {
                secondMaxElem = element;
            }
        }
        System.out.println("Max element in list is: "
                + maxEl
                + " and second max element is: "
                + secondMaxElem);
    }
}
