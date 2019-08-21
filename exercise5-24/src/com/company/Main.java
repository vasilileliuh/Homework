package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        double result =0;
	for(i = 1; i <=97; i+=2){
            result += (double) i / (i+2);
        }
        System.out.println("The result is " + result);
    }
}
