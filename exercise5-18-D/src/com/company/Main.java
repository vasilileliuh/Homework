package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        int rows = 6;

        for(int i = 1; i <= 6; ++i)
        { int rows2 = rows;
            for(int j = 1; j <= i; ++j)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= rows2; ++j)
            {
                System.out.printf("%1d ",j);
            }

            --rows;
            System.out.println();
        }
    }
}