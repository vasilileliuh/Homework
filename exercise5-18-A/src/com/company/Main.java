package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        int rows = 6;

        for(int i = 1; i <= rows; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

