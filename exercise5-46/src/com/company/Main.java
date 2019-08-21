package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a string:");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("The reversed string is:");
        System.out.println(reverse);
    }
}
