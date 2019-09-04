package com.company;

import java.util.Scanner;

public class SumTheDigits {

    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long digit;
        for (int i = 1; i <= quantityOfDigits(n); i++) {
            digit = n % 10;
            n = n / 10;
             digit += digit;
            System.out.println(digit + quantityOfDigits(n));
        }


    }

    public static int quantityOfDigits(long n) {
        int count = 0;
        while (n > 0) {
            count += 1;
            n = (n / 10);
        }
        return count;
    }

//    public static int sumDigits(long n) {
//
//    }

}
