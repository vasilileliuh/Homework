package com.company;

public class BrainFfForApp {

    public static void main(String[] args) {

        int a = 1, b, c = 1;

        for (b = a++; c < ++b; a = c += 2) {
            System.out.printf("%d %d %d\n", --a, --b, c);
        }

    }
}