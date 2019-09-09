package com.company;

import java.util.Scanner;

public class SumTheDigits {

    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println("Sum of Digits = " + SumTheDigitsUtil.quantityOfDigits(n));
    }
}
