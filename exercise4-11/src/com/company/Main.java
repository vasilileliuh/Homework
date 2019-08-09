package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal value (0-15): ");
        int dec = in.nextInt();

        String hex = Integer.toHexString(dec);

        if( dec >= 0 && dec <= 15) {
            System.out.printf("The Hex value is %s \n", hex);
        }else {
            System.out.printf("%d is an invalid input \n", dec);
        }


    }
}
