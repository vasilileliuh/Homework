package com.company;

import java.util.Scanner;

public class Main {

       public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a degrees in Celsius: ");
        double celsius = in.nextDouble();

        Double fahrenheit = 9.0 /5 * celsius +32;

        if( celsius % (int)celsius == 0) {
            System.out.printf("%d Celsius is %.2f Fahrenheit", ((int) celsius), fahrenheit);
        }else {
            System.out.printf("%.2f Celsius is %.2f Fahrenheit", celsius, fahrenheit);
        }

    }
}








