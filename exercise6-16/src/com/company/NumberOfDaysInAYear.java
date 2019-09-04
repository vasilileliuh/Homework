package com.company;

public class NumberOfDaysInAYear {

    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            System.out.println("Year " + year + " consist of " + NumberOfDaysChecker.numberOfDaysInAYear(year) + " days");
        }
    }

}

