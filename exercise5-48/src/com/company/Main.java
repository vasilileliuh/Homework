package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a string:");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = "";

        for(int i = 0; i <= str.length() -1; i++)
        {
            if (i%2 == 0)
            result = result + str.charAt(i);
        }
        System.out.println("Characters at odd positions are:");
        System.out.println(result);
    }
}
