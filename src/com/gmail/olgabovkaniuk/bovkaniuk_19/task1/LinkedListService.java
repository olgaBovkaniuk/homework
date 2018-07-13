package com.gmail.olgabovkaniuk.bovkaniuk_19.task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListService implements CollectionService {

    @Override
    public List<Integer> generateCollection(int collectionLength, int boundOfRandomValue, Random random) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < collectionLength; i++) {
            linkedList.add(random.nextInt(boundOfRandomValue));
        }
        return linkedList;
    }
}
