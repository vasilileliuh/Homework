package com.company;

public class PentagonalNumbersDemo {

    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {
            System.out.print(PentagonalNumbersUtil.getPentagonalNumber(n) + " ");
            if (n % 10 == 0)
                System.out.println();
        }
    }

}
