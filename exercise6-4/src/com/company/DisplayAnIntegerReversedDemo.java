package com.company;

import java.util.Scanner;

public class DisplayAnIntegerReversedDemo {

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        DisplayAnIntegerUtils.reverse(number);
    }
}
