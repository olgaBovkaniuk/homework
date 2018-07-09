package com.gmail.olgabovkaniuk.bovkaniuk_18.task1;

import java.util.Random;
import java.util.concurrent.Callable;

public class GenerateStringCallable implements Callable<StringBuffer> {
    private final Random random = new Random();
    private String symbol1;
    private String symbol2;
    private String symbol3;
    private int stringFrom;
    private int stringTo;

    public GenerateStringCallable(String symbol1, String symbol2, String symbol3, int stringFrom, int stringTo) {
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
        this.symbol3 = symbol3;
        this.stringFrom = stringFrom;
        this.stringTo = stringTo;
    }

    public StringBuffer generateString() {
        String[] strings = {symbol1, symbol2, symbol3};
        StringBuffer stringBuffer = new StringBuffer();
        int randomStringTo = random.nextInt(stringTo - stringFrom + 1) + stringFrom;
        for (int i = 0; i < randomStringTo; i++) {
            stringBuffer.append(strings[random.nextInt(strings.length)]);
        }
        return stringBuffer;
    }

    @Override
    public StringBuffer call() throws Exception {
        return generateString();
    }
}
