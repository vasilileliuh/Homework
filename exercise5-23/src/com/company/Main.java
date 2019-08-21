package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 50000;
	double result = 0;
	double resultRight =0;
	for(int i=1; i<=n; ++i){
	    result += 1/(double)i;
    }
        System.out.println("Calculating result of 1+1/2+1/3...+1/n for n=50000, counted from left to right is " + result);
        for(int i=n; i>=1; --i){
            resultRight += 1/(double)i;
        }
        System.out.println("Calculating result of 1+1/2+1/3...+1/n for n=50000, counted from right to left is " + resultRight);


    }
}
