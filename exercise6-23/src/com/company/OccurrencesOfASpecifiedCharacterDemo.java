package com.company;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterDemo {

    public static void main(String[] args) {
        System.out.println("Enter a string to check of occurrences of a specified character:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        System.out.println("Enter specified character:");
        char a = in.next().charAt(0);
        System.out.println("Number of occurrences of \'" + a + "\' is " + OccurrencesCounter.count(str, a) + " time(s).");
    }

}
