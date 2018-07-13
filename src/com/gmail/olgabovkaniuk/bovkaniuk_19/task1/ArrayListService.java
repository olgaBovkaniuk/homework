package com.gmail.olgabovkaniuk.bovkaniuk_19.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListService implements CollectionService {

    @Override
    public List<Integer> generateCollection(int collectionLength, int boundOfRandomValue, Random random) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < collectionLength; i++) {
            arrayList.add(random.nextInt(boundOfRandomValue));
        }
        return arrayList;
    }
}
