package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeCalculatorApp {

    private static final short CURRENT_YEAR = 2019;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //double a = Double.parseDouble(reader.readLine());

        System.out.println("Please enter your birthday year(4 digits only): ");
        short userBirthday = Short.parseShort(reader.readLine());
        System.out.println("Your age is: " + ageCalculator(userBirthday));
    }

    static short ageCalculator(short userBirthday) {
        return (short) (CURRENT_YEAR - userBirthday);
    }
}
