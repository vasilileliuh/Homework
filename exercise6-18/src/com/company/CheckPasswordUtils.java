package com.company;

public class CheckPasswordUtils {
    public static int digitsCheck(String passwordToCheck) {
        int digits = 0;
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isDigit(passwordToCheck.charAt(i)))
                digits++;
        }
        return digits;
    }

    public static int lettersCheck(String passwordToCheck) {
        int letters = 0;
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isLetter(passwordToCheck.charAt(i)))
                letters++;
        }
        return letters;
    }
}