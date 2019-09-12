package com.company;

import java.util.Scanner;

public class CreditCardNumberValidationDemo {

    public static void main(String[] args) {
        System.out.println("Enter a credit card number as a long integer:");
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        if (CreditCardNumberUtils.isValid(number))
            System.out.println(number + " is valid.");
        else
            System.out.println(number + " is invalid.");
    }


}