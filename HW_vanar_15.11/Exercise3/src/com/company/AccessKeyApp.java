package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccessKeyApp {

    public static void main(String[] args) throws IOException {

        final long ACCESS_KEY = 0xFEDCBA987654321L;
        final long ACCESS_KEY_UNSIGNED = 0xFEDCBA9876543210L;
        long key;

        System.out.println("Please enter your key: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        try {
            key = Long.parseUnsignedLong(input, 16);
            System.out.println((key == ACCESS_KEY || key == ACCESS_KEY_UNSIGNED) ? "Access Granted!" : "Access Denied!");
        } catch (Exception e) {
            System.out.println("Something went wrong.\nAccess Denied!");
        }
    }
}
