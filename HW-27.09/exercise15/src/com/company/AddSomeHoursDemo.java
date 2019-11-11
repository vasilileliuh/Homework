package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class AddSomeHoursDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter amount of hours to add to current time: ");
        int hoursToAdd = in.nextInt();
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);
        timeMachine(hoursToAdd, LocalTime.now());
    }

    public static void timeMachine(int hoursToAdd, LocalTime now) {
        LocalTime nowPlusSomeHours = now.plusHours(hoursToAdd);
        System.out.println("Time plus " + hoursToAdd + " hour(s) is " + nowPlusSomeHours);
    }
}
