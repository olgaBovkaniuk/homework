package com.gmail.olgabovkaniuk.bovkaniuk_7.class_task_7.task3;

/*
        3. Ввести массив строк и найти в нем максимальную по длине строку.
            a) Не учитывать случай, когда таких строк несколько
            b) Если строка с максимальной длиной не одна, вывести все.
*/

public class MaxStringInArrayService {

    //case a)
    public void printMaxElemInArray(String[] arrString) {
        String str = finMaxElemInArray(arrString);
        System.out.println(str);
    }

    // case b)
    public void printAllMaxElemInArray(String[] arrString) {
        String str = finMaxElemInArray(arrString);
        for (String stringInArray: arrString) {
            if (stringInArray.length() == str.length()) {
                System.out.println(stringInArray);
            }
        }
    }

    private String finMaxElemInArray(String[] arrString) {
        int maxString = 0;
        int index = 0;
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].length() > maxString) {
                maxString = arrString[i].length();
                index = i;
            }
        }
        return arrString[index];
    }
}
