package com.company;

import java.util.Scanner;

public class Main {

    // public static final int MINUTES_IN_DAY = 1440;
    // public static final int DAYS_IN_YEAR = 365;

    public static void main(String[] args) {
	// write your code here

                 System.out.println();

                Scanner in = new Scanner(System.in);
                System.out.print("Enter the number of minutes: ");
                byte asciiCode = in.nextByte();

                char c = (char)asciiCode;

                System.out.printf("The character for ASCII code %d is %s \n", asciiCode, c);



    }
}
