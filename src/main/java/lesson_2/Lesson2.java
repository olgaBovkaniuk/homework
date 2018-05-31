package main.java.lesson_2;

public class Lesson2 {
    public static void main(String args[]) {
        int firstNumber  = 1;
        int secondNumber = 2;
        int thirdNumber  = 3;

        int resultAverage = average(firstNumber, secondNumber, thirdNumber);
        print("Average of integers = " + resultAverage);

        print("I can do it!");

        int resultOfArithmeticOperations = arithmeticOperations(firstNumber, secondNumber);
        print("Result of arithmetic operations x*y+x+y = " + resultOfArithmeticOperations);

    }

    static int average(int first, int second, int third) {
        int average = (first + second + third) / 3;
        return average;
    }

    static void print(String toPrint) {
        System.out.println(toPrint);
    }

    /**
     * formula is x*y+x+y
     */
    static int arithmeticOperations(int first, int second) {
        int result = first;
        result *= second;
        result += first;
        result += second;
        return result;
    }
}
