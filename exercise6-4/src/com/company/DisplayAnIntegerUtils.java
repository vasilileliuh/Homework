package com.company;

class DisplayAnIntegerUtils {

    public static void reverse(int number) {
        int oneDigit;
        String reversedDigits = "";
        while (number > 0) {
            oneDigit = number % 10;
            reversedDigits = reversedDigits + oneDigit;
            number = number / 10;
        }
        System.out.println(reversedDigits);
    }
}
