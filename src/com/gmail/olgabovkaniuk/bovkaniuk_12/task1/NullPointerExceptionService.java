package com.gmail.olgabovkaniuk.bovkaniuk_12.task1;

public class NullPointerExceptionService {

    public void throwAndCatchNPE() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void generateNPE() {
        Object obj = null;
        obj.toString();
    }

    public void generateAndCatchNPE() {
        try {
            generateNPE();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
