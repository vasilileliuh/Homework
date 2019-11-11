package com.company;

import java.io.Console;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateVariablesApp {

    public static void main(String[] args) {

        int currentYear = 2019;
        int currentMonth = 11;
        int currentDay = 11;

        System.out.print("Today is: " + currentDay + "-" + currentMonth + "-" + currentYear + "\n");

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateInStringFormat = currentDate.format(formatter);

        System.out.println("Today is: " + currentDateInStringFormat);
    }
}
