package com.company;

public class CalculatorMethodsApp {

    public static void main(String[] args) {

        printDivider();
        printResult(0);
        printDivider();
        printResult(10);
        printDivider();
        printResult(99999999);
        printDivider();
        printResult(999999999);
        printDivider();
        printResult(-100);
        printDivider();
        printResult(add(1, 2));
        printDivider();
        printResult(pow(10, 3));
        printDivider();
        printResult(sub(add(1, mul(pow(2, 3), div(3, 4))), 5));

    }

    private static void printResult(int result) {
        if (result > 99999999 || result < -99999999)
            System.out.println("Error");
        else
            System.out.printf("result: %08d\n", result);
    }

    private static void printDivider() {
        System.out.println("################");
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int div(int a, int b) {
        return a / b;
    }

    private static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
