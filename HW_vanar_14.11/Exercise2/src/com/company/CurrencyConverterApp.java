package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyConverterApp {

    private static final double CURRENT_DAY_EXCHANGE_RATE = 17.51;

    public static void main(String[] args) throws IOException {

        System.out.print("How much money do you have(in USD)? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userInput = Integer.parseInt(reader.readLine());
        System.out.printf("This is equivalent to %.2f MDL%n", currencyConverterUSDtoMDL(userInput));
    }

    private static double currencyConverterUSDtoMDL(int userInput) {
        return userInput * CURRENT_DAY_EXCHANGE_RATE;
    }
}
