package com.company;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] arrayF = new int[36];

        int[] arrayG = new int[5];
        for (int i = 0; i < arrayG.length; i++) {
            arrayG[i] = 8;
        }
        double[] arrayC = new double[100];
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = i;
        }
        int[] arrayA = new int[11];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i + 2;
        }
        int[] arrayB = new int[34];
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }
        double[] arrayW = new double[99];
        double minValue = Double.MAX_VALUE, maxValue = 0;
        for (int i = 0; i < arrayW.length; i++) {
            arrayW[i] = i + 0.5;
            if (arrayW[i] > maxValue)
                maxValue = arrayW[i];
            if (arrayW[i] < minValue)
                minValue = arrayW[i];
        }


        System.out.println("Array F (sixth element value)");
        System.out.println(arrayF[5]);

        System.out.println("Array G (five elements = 8)");
        for (int i = 0; i < arrayG.length; i++) {
            System.out.print(arrayG[i] + " ");
        }
        System.out.println();
        System.out.println("Array C (sum of 100 elements)");
        int sum = 0;
        for (int i = 0; i < arrayC.length; i++) {
            sum += (int) arrayC[i];
        }
        System.out.println(sum);
        System.out.println("Array A (11 elements )");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();
        System.out.println("Array B (34 elements with copied elements of array A)");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }
        System.out.println();
        System.out.println("Array W (min and max value)");
        for (int i = 0; i < arrayW.length; i++) {
            System.out.print(arrayW[i] + " ");
        }
        System.out.println();
        System.out.println("min value = " + minValue + " max value = " + maxValue);

    }

}