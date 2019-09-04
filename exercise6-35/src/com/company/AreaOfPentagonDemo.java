package com.company;

import java.util.Scanner;

public class AreaOfPentagonDemo {

    public static void main(String[] args) {
        System.out.println("Enter the side of pentagon:");
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        System.out.println("The area of pentagon is " + PentagonUtils.area(side));
    }
}
