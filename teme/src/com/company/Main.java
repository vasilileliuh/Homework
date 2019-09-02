package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in)
        System.out.println("Enter 5 digits");

        Integer a = in.nextInt();
        Integer b = in.nextInt();
        Integer c = in.nextInt();
        Integer d = in.nextInt();
        Integer e = in.nextInt();

        if(c>0){
          ++countOfPositiveNumbers;
        }else if (a<0){
            ++countOfNegativeNumbers;
        }

    }
}
