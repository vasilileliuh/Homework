package com.company;

import java.util.Scanner;

public class DisplayPatternDemo {

    public static void main(String[] args) {

        System.out.println("Enter n number >");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DigitsPatternCreator.displayPattern(n);

    }


}