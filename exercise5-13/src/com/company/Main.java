package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Table of factorials n! form 1 - 20.");
        System.out.println();
        for(int num = 1; num <= 20; ++num) {

            int i = 1;
            long factorial = 1;
            while(i <= num)
            {
                factorial *= i;
                i++;
            }
            System.out.printf("Factorial of %d = %d\n", num, factorial);
            }
        }

    }


