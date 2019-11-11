package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Friday13OccurenceInInXXCentury {

    public static void main(String[] args) {
        LocalDate from = LocalDate.of(1999, 12, 31).minusYears(100);
        LocalDate to = LocalDate.of(1999, 12, 31);
        System.out.println("Quantity of friday 13th in XX century = " + DayCheckerUtil.countDayBetween(DayOfWeek.FRIDAY, 13, from, to));
    }
}
