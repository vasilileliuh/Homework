package com.company;

import java.util.Scanner;

public class DisplayMatrixDemo {

    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MatrixDeveloper.printMatrix(n);
    }

}
