package com.company;

public class DigitsPatternCreator {
    public static void displayPattern (int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
