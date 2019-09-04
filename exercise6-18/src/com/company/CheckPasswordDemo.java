package com.company;

import java.util.Scanner;

public class CheckPasswordDemo {

    public static void main(String[] args) {
        System.out.println("Enter please a password >");
        Scanner in = new Scanner(System.in);
        String passwordToCheck = in.nextLine();
        int length = passwordToCheck.length();
        int digits = CheckPasswordUtils.digitsCheck(passwordToCheck);
        int letters =CheckPasswordUtils.lettersCheck(passwordToCheck);
        if (length >= 8 && digits >= 2 && digits + letters == length) {
            System.out.println("Valid Password");
        } else System.out.println("Invalid Password");
    }
}
