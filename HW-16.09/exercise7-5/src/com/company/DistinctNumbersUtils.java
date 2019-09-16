package com.company;

public class DistinctNumbersUtils {

    static int distinctCounter(int array[]){
        int distinctCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                distinctCounter++;
        }
        return distinctCounter;
    }

    static void printDistinctNumbers(int[] array){
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
