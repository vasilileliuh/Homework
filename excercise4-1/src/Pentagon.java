package com.company;

import java.util.Scanner;

public class Pentagon {

    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double radius = in.nextDouble();

        double a = Math.PI/5;
        double sin = Math.sin(a);
        double tan = Math.tan(a);

        double side = 2 * radius * sin;
        double area = (5*side*side) / (4*tan);

        System.out.printf("The area of the pentagon is %.2f \n", area);

    }
}