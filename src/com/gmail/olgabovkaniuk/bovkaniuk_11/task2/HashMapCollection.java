package com.gmail.olgabovkaniuk.bovkaniuk_11.task2;

import java.util.Map;

public class HashMapCollection {

    public void printMapKey(Map<String, String> map) {
        System.out.println("The keys: ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
