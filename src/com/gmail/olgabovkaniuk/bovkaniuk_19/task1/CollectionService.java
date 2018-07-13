package com.gmail.olgabovkaniuk.bovkaniuk_19.task1;

import java.util.List;
import java.util.Random;

public interface CollectionService {
    List<Integer> generateCollection(int collectionLength, int boundOfRandomValue, Random random);
}
