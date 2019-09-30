package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LocalDate birthDay = LocalDate.of(1978, 1, 26);
        LocalDate now = LocalDate.now();
        System.out.println(birthDay);
        System.out.println(now);
        int bd = (int) birthDay.toEpochDay();
        int nw = (int) now.toEpochDay();
        System.out.println(bd + " " + nw);
        System.out.println("I'm alive " + (nw - bd) + " days.");
    }
}
