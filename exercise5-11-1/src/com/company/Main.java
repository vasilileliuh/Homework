package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        for(int i=100, j=0; i<=200; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)){
                System.out.printf("%d ", i);
                j++;
            }
            if (j % 5 == 0 && j>0) {
                System.out.println();
                j=0;
            }

        }
    }
}



