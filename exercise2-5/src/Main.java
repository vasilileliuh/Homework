package com.company;

import java.util.Scanner;

public class Main {

    public static final double PERCENT_VALUE = Integer.valueOf(100);

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        Double subtotal = in.nextDouble();
        Double gratuityRate = Double.valueOf(in.nextDouble());

        double gratuity = subtotal * gratuityRate.doubleValue() / PERCENT_VALUE;
        Double total = new
Double(subtotal + gratuity);

        System.out.printf("the gratuity is $%.2f and total is $%.2f\n", gratuity, total);



    }
}
