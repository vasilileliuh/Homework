package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Enter the loan amount >");
        Scanner in = new Scanner(System.in);
        int loanAmount = in.nextInt();
        System.out.println("Enter the loan period in number of years >");
        int loanPeriodYears = in.nextInt();
        int loanPeriodInMonths = loanPeriodYears * 12;
        System.out.println("Interest Rate      Monthly Payment     Total Payment");
        for (double i=5; i<=8; i+=0.125){
            double a2 = 1+i/1200;
             double monthlyPayment = (loanAmount * i/1200 * Math.pow(a2, loanPeriodInMonths)) / (Math.pow(a2, loanPeriodInMonths) - 1);
             double totalPayment = monthlyPayment * loanPeriodInMonths;
            System.out.printf("%-19.3f%-20.2f%.2f\n", i, monthlyPayment, totalPayment);
        }


    }
}
