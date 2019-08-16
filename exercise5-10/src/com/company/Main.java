package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();
	for(int i=100, j=0; i<=1000; i++) {
        if (i % 5 == 0 && i % 6 == 0) {
            System.out.printf("%d ", i);
            j++;
        }
        if (j % 10 == 0 && j>0) {
            System.out.println();
//           System.out.println(j);
            j=0;

        }

	    }
    }
}



