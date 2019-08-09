package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = in.next().charAt(0);

        char c = character;
        int a = (int)c;


        System.out.printf("The Unicode for character %s is %d \n", character, a);



    }
}
