package com.company;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LastDayOfMonth {

    public static void main(String[] args) {
	// write your code here
        LocalDate now = LocalDate.now();
        LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("The last day of " + now.getMonth() + " is " + lastDayOfMonth);
    }
}
