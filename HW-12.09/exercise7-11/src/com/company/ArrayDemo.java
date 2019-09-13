package com.company;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] countsArray = new int[40];
        for (int i = 0; i < countsArray.length; i++) {
            countsArray[i] = 2 + i * i + 2 * i;
        }

        for (int i = 0; i < countsArray.length; i++) {
            System.out.print(countsArray[i] + " ");
            if (i % 10 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();
// a)
        for (int i = 0; i < 10; i++) {
            countsArray[i] = 0;
        }
        for (int i = 0; i < countsArray.length; i++) {
            System.out.print(countsArray[i] + " ");
            if (i % 10 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();
// b)
        int[] arrayBonus = new int[15];
        for (int i = 0; i < arrayBonus.length; i++) {
            arrayBonus[i] += 1;
        }
        for (int i = 0; i < arrayBonus.length; i++) {
            System.out.print(arrayBonus[i] + " ");
            if (i % 10 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println();
//c
        int[] bestScores = new int[25];
        for (int i = 0; i < bestScores.length-20; i++){
            System.out.println(bestScores[i]);
        }
    }
}
