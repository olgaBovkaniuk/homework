package com.gmail.olgabovkaniuk.bovkaniuk_10.task2;

import java.util.ArrayList;
import java.util.List;

public class ChangeSymbolInListStringService {

    public void getChangedString(List<String> strings) {

        List<String> newList = new ArrayList<>(strings.size());
        for (String element : strings) {
            if (element.contains("+")) {
                newList.add(element.replaceAll("\\+", "+++"));
            } else {
                newList.add(element);
            }
        }
        System.out.println(newList);
    }
}
