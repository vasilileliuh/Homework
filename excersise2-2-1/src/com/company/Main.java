package com.company;

import java.util.Scanner;

public class Main {

    public static final double PI_NUMBER = 3.14159;

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = in.nextDouble();
        double length = in.nextDouble();

        double area = radius * radius * PI_NUMBER;
        double volume = area * length;

        System.out.printf("the Area is %.4f\n", area);
        System.out.printf("the Length is %.1f\n", volume);


        }
    }
