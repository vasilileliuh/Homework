package com.company;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a desired month date in format YYYY-MM-DD: ");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        LocalDate usersDate = LocalDate.parse(date);
        LocalDate lastDayOfMonth = usersDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("The last day of " + usersDate.getMonth() + " " + usersDate.getYear() + " is " + lastDayOfMonth);
    }
}

