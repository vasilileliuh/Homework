package com.company;

import java.time.LocalDate;

public class PlusTwoWeeksDemo {

    public static void main(String[] args) {
	// write your code here
        LocalDate now = LocalDate.now();
        LocalDate plusTwoWeeks = now.plusWeeks(2);
        System.out.println("Today's date: " + now);
        System.out.println("Current date plus two weeks is: " + plusTwoWeeks);
    }
}
