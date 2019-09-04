package com.company;

public class NumberOfDaysChecker {
    public static int numberOfDaysInAYear(int year) {
        int quantityOfDays;
        if (year % 4 != 0)
            quantityOfDays = 365;
        else if (year % 100 != 0)
            quantityOfDays = 366;
        else if (year % 400 != 0)
            quantityOfDays = 365;
        else
            quantityOfDays = 366;
        return quantityOfDays;
    }
}
