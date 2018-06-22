package com.gmail.olgabovkaniuk.util;

import java.util.Random;

public class RandomService {

    private Random random = new Random();

    public int getRandomNumber(int start, int end) {

        return random.nextInt(end - start + 1) + start;

    }
}
