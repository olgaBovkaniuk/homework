package com.gmail.olgabovkaniuk.bovkaniuk_10;

import java.util.Random;

public class RandomService {

    private Random random = new Random();

    public int getRandomNumber(int start, int end) {

        return random.nextInt(end - start + 1) + start;

    }
}
