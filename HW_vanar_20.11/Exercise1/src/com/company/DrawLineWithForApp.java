package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DrawLineWithForApp {

    public static void main(String[] args) throws IOException {

        char direction = ' ';
        byte length = 0;
        boolean condition = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter line length(from 1 to 127): ");

        while (condition) {
            try {
                length = Byte.parseByte(reader.readLine());
            } catch (Exception e) {
                System.out.println("Something went wrong. Try again: ");
            }
            if (length > 0)
                condition = false;
        }

        System.out.println("Enter line direction (v - vertical; h - horizontal): ");

        while (!condition) {
            String inputString = reader.readLine();
            direction = inputString.charAt(0);
            if (direction == 'h' || direction == 'v')
                condition = true;
            else
                System.out.println("Try again: ");
        }

        if (direction == 'h') {
            for (int i = 1; i <= length; i++)
                System.out.print("-");
        } else {
            for (int i = 1; i <= length; i++)
                System.out.println("|");
        }
    }
}