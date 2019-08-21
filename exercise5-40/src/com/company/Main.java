package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Random rand = new Random();
        int heads = 0;
        int tails = 0;
        for (int i=1; i<=1_000_000; i++) {
            int n = rand.nextInt(1_000_000);
            n += 1;
            if (n%2==0)
                tails++;
            else
                heads++;
//            int temp = (n % 2 == 0) ? tails++ : heads++;
        }
        System.out.println("After flipping a coin 1 000 000 times you would have:");
        System.out.printf("%d number of tails and %d number of heads", tails, heads);

    }
}
