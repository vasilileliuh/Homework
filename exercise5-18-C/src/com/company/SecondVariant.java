package com.company;

public class SecondVariant {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = i; j <= 6; j++) {
                System.out.print("ab");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}