package com.company;

import java.util.Random;

public class MatrixDeveloper {
    public static void printMatrix(int n) {
        Random rand = new Random();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                int computerChoice = rand.nextInt(2);
                System.out.print(computerChoice + " ");
            }
            System.out.println();
        }
    }
}
