package com.company;

import java.util.Scanner;

public class Main {

       public static final int MINUTES_IN_DAY = 1440;
       public static final int DAYS_IN_YEAR = 365;

        public static void main(String[] args) {

            System.out.println();

            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of minutes: ");
            long minutes = in.nextInt();

            long years = minutes / (MINUTES_IN_DAY * DAYS_IN_YEAR);
            long leftDaysInMinutes = minutes - years * MINUTES_IN_DAY * DAYS_IN_YEAR ;
            long days = leftDaysInMinutes / MINUTES_IN_DAY;

            System.out.printf("%d minutes is approximately %d years and %d days \n", minutes, years, days);

        }
    }

