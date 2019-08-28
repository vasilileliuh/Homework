package com.company;

public class ISBNChecker {
    String computeFullLengthISBN(String isbn) {

        if (isbn.length() != 12)

            return "Invalid input";

        int digit13 = 0;

        for (int i = 0; i < isbn.length(); i++) {

            int n = Character.getNumericValue(isbn.charAt(i));

            digit13 = (i % 2 == 0) ? digit13 + n : digit13 + n * 3;

        }

        digit13 = 10 - digit13 % 10;

        if (digit13 == 10)

            digit13 = 0;

        return isbn + digit13;

    }
}
