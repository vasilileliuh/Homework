package com.company;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class ArrayDemo {

    public static void main(String[] args) {

        int[][] biArrayT = new int[2][3];
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[i].length; j++) {
                biArrayT[i][j] = i + j + 2;
            }
        }
        System.out.println("Bi array T [2][3]");
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[i].length; j++) {
                System.out.print(biArrayT[i][j] + " ");
            }
            if (i % 1 == 0)
                System.out.println();
        }

        System.out.println("All elements in row one");
        for (int j = 0; j < biArrayT[1].length; j++) {
            System.out.print(biArrayT[1][j] + " ");
        }
        System.out.println();
        System.out.println("All elements in column one");
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 1; j < biArrayT[1].length - 1; j++) {
                System.out.print(biArrayT[i][j] + " ");
            }
            if (i % 1 == 0)
                System.out.println();
        }
        biArrayT[0][1] = 0;
        System.out.println("Bi array T [2][3], element at position 01 set to 0");
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[i].length; j++) {
                System.out.print(biArrayT[i][j] + " ");
            }
            if (i % 1 == 0)
                System.out.println();
        }
        System.out.println("Bi array T [2][3], all elements set to 0 manually");
        biArrayT[0][0] = 0;
//        biArrayT[0][1] = 0;
        biArrayT[0][2] = 0;
        biArrayT[1][0] = 0;
        biArrayT[1][1] = 0;
        biArrayT[1][2] = 0;

        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[1].length; j++) {
                System.out.print(biArrayT[i][j] + " ");
            }
            if (i % 1 == 0)
                System.out.println();
        }
        System.out.println("Bi array T [2][3], all elements set to 1 using cycle");
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[i].length; j++) {
                biArrayT[i][j] = 1;
            }
        }
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[1].length; j++) {
                System.out.print(biArrayT[i][j] + " ");
            }
            if (i % 1 == 0)
                System.out.println();
        }
        System.out.println("Bi array T [2][3], all elements should enter user");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[i].length; j++) {
                System.out.print("Please enter element at position [" + i + "][" + j + "] ");
                biArrayT[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[i].length; j++) {
                System.out.print(biArrayT[i][j] + " ");
            }
            if (i % 1 == 0)
                System.out.println();
        }
        System.out.println("Bi array T [2][3], show the smallest value");
        int smallestValue = Integer.MAX_VALUE;
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 0; j < biArrayT[i].length; j++) {
                if (biArrayT[i][j] < smallestValue)
                    smallestValue = biArrayT[i][j];
            }
        }
        System.out.println("The smallest value is: " + smallestValue);
        System.out.println("Elements of the first row:");
        System.out.print(biArrayT[1][0] + " " + biArrayT[1][1] + " " + biArrayT[1][2]);
        System.out.println();
        System.out.println("The sum of third column of Bi array T [2][3] is");
        int sum = 0;
        for (int i = 0; i < biArrayT.length; i++) {
            for (int j = 2; j < biArrayT[i].length; j++) {
                sum += biArrayT[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("Tabular form of array");
        System.out.print("     [0] [1] [2]\n");
        for (int i = 0; i < biArrayT.length; i++) {
            System.out.print("[" + i + "]");
            for (int j = 0; j < biArrayT[i].length; j++) {
                System.out.printf("%4d", biArrayT[i][j]);
            }
            if (i % 1 == 0)
                System.out.println();
        }


    }
}
