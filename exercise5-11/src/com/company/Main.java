package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter several integers. First integer will indicate the number of values to input.");
        Scanner in = new Scanner(System.in);
        int numberOfInputs = in.nextInt();

         int smallestValue = Integer.MAX_VALUE;
         for ( int i = 1; i <= numberOfInputs; i++ ){
             System.out.println("Enter next number");
              int nextNumber = in.nextInt();
              smallestValue = smallestValue > nextNumber ? nextNumber : smallestValue;

         }
        System.out.println("The smallest value is " + smallestValue);

    }
}
