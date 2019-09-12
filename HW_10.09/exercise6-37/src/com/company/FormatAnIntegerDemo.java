package com.company;

import java.util.Scanner;

public class FormatAnIntegerDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        System.out.print("Enter width of that number: ");
        int width = in.nextInt();
        System.out.println(IntegerUtil.format(number, width));
    }

}
