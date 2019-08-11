package com.company;

import java.util.Scanner;

public class Main {

    static final int FREE_HOURS_INCLUDED_IN_PACKAGE_A = 10;
    static final int PRICE_OF_EXTRA_HOURS_IN_PACKAGE_A_USD = 2;
    static final int FREE_HOURS_INCLUDED_IN_PACKAGE_B = 20;
    static final int PRICE_OF_EXTRA_HOURS_IN_PACKAGE_B_USD = 1;
    static final float MONTH_PAYMENT_PACKAGE_A_USD = 9.95f;
    static final float MONTH_PAYMENT_PACKAGE_B_USD = 13.95f;
    static final float MONTH_PAYMENT_PACKAGE_C_USD = 19.95f;

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        System.out.print("Enter the letter of package (A, B or C) and the number of used hours: ");
                char packageLetter = in.next().toLowerCase().charAt(0);
                int hours = in.nextInt();

                switch (packageLetter) {

                case 'a':
                    int hoursA = (hours < FREE_HOURS_INCLUDED_IN_PACKAGE_A) ? FREE_HOURS_INCLUDED_IN_PACKAGE_A : hours;
                    int extraHoursA = hoursA - FREE_HOURS_INCLUDED_IN_PACKAGE_A;
                    float monthPaymentA = MONTH_PAYMENT_PACKAGE_A_USD + extraHoursA * PRICE_OF_EXTRA_HOURS_IN_PACKAGE_A_USD;
                    System.out.printf("Your total payment is %.2f dollars \n", monthPaymentA);
                    int hoursAB = (hours < FREE_HOURS_INCLUDED_IN_PACKAGE_B) ? FREE_HOURS_INCLUDED_IN_PACKAGE_B : hours;
                    int extraHoursAB = hoursAB - FREE_HOURS_INCLUDED_IN_PACKAGE_B;
                    float monthPaymentAB = MONTH_PAYMENT_PACKAGE_B_USD + extraHoursAB;
                    float differenceMonthPaymentAB = monthPaymentA - monthPaymentAB;
                    float differentMonthPaymentAC = monthPaymentA - MONTH_PAYMENT_PACKAGE_C_USD;
                    if(monthPaymentA > monthPaymentAB)
                       System.out.printf("You would save %.2f dollars if switch to Package B\n", differenceMonthPaymentAB);
                    if(monthPaymentA > MONTH_PAYMENT_PACKAGE_C_USD)
                       System.out.printf("You would save %.2f dollars if switch to Package C\n", differentMonthPaymentAC);
                break;

                case 'b':

                    int hoursB = (hours < FREE_HOURS_INCLUDED_IN_PACKAGE_B) ? FREE_HOURS_INCLUDED_IN_PACKAGE_B : hours;
                    int extraHoursB = hoursB - FREE_HOURS_INCLUDED_IN_PACKAGE_B;
                    float monthPaymentB = MONTH_PAYMENT_PACKAGE_B_USD + extraHoursB;
                    System.out.printf("Your total payment is %.2f dollars \n", monthPaymentB);
                    float differentMonthPaymentBC = monthPaymentB - MONTH_PAYMENT_PACKAGE_C_USD;
                    if(monthPaymentB > MONTH_PAYMENT_PACKAGE_C_USD)
                        System.out.printf("You would save %.2f dollars if switch to Package C\n", differentMonthPaymentBC);
                break;

                case 'c':
                     System.out.printf("Your total payment is %.2f dollars \n", MONTH_PAYMENT_PACKAGE_C_USD);
                break;
                default: System.out.print("Wrong entered package or number of used hours \n");
        }

        }
        }