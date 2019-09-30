package com.company;

import java.time.LocalDate;

public class OneYearAddDemo {

    public static void main(String[] args) {
        // write your code here
        LocalDate date = LocalDate.of(2000, 2, 29);
        System.out.println("Initial date " + date);
        System.out.println(date.plusYears(1));
        System.out.println(date.plusYears(4));
        for (int i = 0; i < 4; i++) {
            System.out.println(date.plusYears(1));
        }

    }
}
