package com.company;

class PalindromeUtils {

    static String reverse(int number) {
        int oneDigit;
        String reversDigits = "";
        while (number > 0) {
            oneDigit = number % 10;
            reversDigits = reversDigits + oneDigit;
            number = number / 10;
        }
        return reversDigits;
    }

    static boolean isPalindrome(int number) {
        String commonDigitsInString = String.valueOf(number);
        String reverseDigitsInString = reverse(number);
        return reverseDigitsInString.equals(commonDigitsInString);
    }

    static void printMessageWithCheckedResult(String s, int number) {
        printCheckedResult(number);
        System.out.println(s);
    }

    private static void printCheckedResult(int number) {
        System.out.print("The integer " + number);
    }
}
