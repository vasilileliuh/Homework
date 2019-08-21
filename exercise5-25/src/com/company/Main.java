package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        for( int n = 10_000; n<= 100_000; n+=10_000) {
            double pi = 0;
            for (int i = 1; i <= n; i++) {
                pi += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
            }
            System.out.printf("Calculated value of Pi with precision n = %d is %.15f\n",n, pi);
        }
    }
}
