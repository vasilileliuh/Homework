package com.company;

public class CreditCardNumberUtils {
    public static boolean isValid(long number) {
        boolean hasCorrectLength = false;
        boolean hasCorrectPrefix = false;
        boolean passesLuhnCheck = false;
        int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        int length = getSize(number);
        if (length >= 13 && length <= 16)
            hasCorrectLength = true;
        if (prefixMatched(number, 4)
                || prefixMatched(number, 5)
                || prefixMatched(number, 37)
                || prefixMatched(number, 6))
            hasCorrectPrefix = true;
        if (totalSum % 10 == 0)
            passesLuhnCheck = true;
        return hasCorrectLength && hasCorrectPrefix && passesLuhnCheck;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sumOfDoubleEvenDigits = 0;
        long oneDigit;
        int length = getSize(number);
        for (int i = 1; i <= length; i++) {
            oneDigit = number % 10;
            if (i % 2 == 0)
                sumOfDoubleEvenDigits = sumOfDoubleEvenDigits + ((oneDigit * 2 >= 10)
                        ? getDigit((int) oneDigit * 2)
                        : (int) oneDigit * 2);
            number = number / 10;
        }
        return sumOfDoubleEvenDigits;
    }

    public static int getSize(long d) {
        int counterOfDigits = 0;
        while (d > 0) {
            d = d / 10;
            counterOfDigits++;
        }
        return counterOfDigits;
    }

    public static int getDigit(int number) {
        int oneDigit, sum = 0;
        for (int i = 1; i < getSize(number); i++) {
            oneDigit = number % 10;
            sum = sum + oneDigit;
            number = number / 10;
        }
        return sum;
    }

    public static int sumOfOddPlace(long number) {
        int sumOfOddDigits = 0;
        long oneDigit;
        int length = getSize(number);
        for (int i = 1; i <= length; i++) {
            oneDigit = number % 10;
            if (i % 2 != 0)
                sumOfOddDigits = sumOfOddDigits + (int) oneDigit;
            number = number / 10;
        }
        return sumOfOddDigits;
    }

    public static boolean prefixMatched(long number, int d) {
        return d == getPrefix(number, 2) || d == getPrefix(number, 1);
    }

    public static long getPrefix(long number, int k) {
        int length = getSize(number);
        for (int i = 1; i <= length - k; i++) {
            number = number / 10;
        }
        return number;
    }

}
