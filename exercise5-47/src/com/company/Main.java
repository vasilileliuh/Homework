package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
         int d13 = 0;
        if(str.length() == 12)
        {
            for ( int i =0; i < str.length(); i++){

                int digit = Character.getNumericValue(str.charAt(i));
                d13 = (i % 2 == 0) ? d13 + digit : d13 + digit * 3;
            }
//        char d1 = str.charAt(0);
//        char d2 = str.charAt(1);
//        char d3 = str.charAt(2);
//        char d4 = str.charAt(3);
//        char d5 = str.charAt(4);
//        char d6 = str.charAt(5);
//        char d7 = str.charAt(6);
//        char d8 = str.charAt(7);
//        char d9 = str.charAt(8);
//        char d10 = str.charAt(9);
//        char d11 = str.charAt(10);
//        char d12 = str.charAt(11);
//
//        int i1 = Character.getNumericValue(d1);
//        int i2 = Character.getNumericValue(d2);
//        int i3 = Character.getNumericValue(d3);
//        int i4 = Character.getNumericValue(d4);
//        int i5 = Character.getNumericValue(d5);
//        int i6 = Character.getNumericValue(d6);
//        int i7 = Character.getNumericValue(d7);
//        int i8 = Character.getNumericValue(d8);
//        int i9 = Character.getNumericValue(d9);
//        int i10 = Character.getNumericValue(d10);
//        int i11 = Character.getNumericValue(d11);
//        int i12 = Character.getNumericValue(d12);
//
//        int d13 = 10 -(i1 + 3*i2 + i3 + 3*i4 + i5 + 3*i6 + i7 + 3*i8 + i9 + 3*i10 + i11 + 3*i12)%10;
          d13 = 10 - d13 % 10;
        if (d13 == 10)
            d13 = 0;

        System.out.println("The ISBN-13 numbers is:" + str + d13);

        }else
            System.out.printf("%s is an invalid input", str);

    }
}
