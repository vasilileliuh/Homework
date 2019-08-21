package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        double result = 0;
        for (int i=1; i<= 624; i++){
            result += 1 / (Math.sqrt(i) + Math.sqrt(i+1));
        }
        System.out.println("The result of summation is: " + result);
    }
}
