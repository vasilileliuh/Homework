package com.company;

public class Accumulator {

    public static void main(String[] args) {
        int incomeOne = 100;
        int incomeTwo = 200;
        int incomeThree = 300;

        int moneyAccumulator = 0;

        int expenses = 45;

        moneyAccumulator += incomeOne;
        moneyAccumulator += incomeTwo;
        moneyAccumulator += incomeThree;

        moneyAccumulator -= expenses;

        System.out.printf("  %dMDL:\n  %dMDL\n+ %dMDL\n+ %dMDL\n--------\n- %dMDL\n", moneyAccumulator, incomeOne, incomeTwo, incomeThree, expenses);

    }
}
