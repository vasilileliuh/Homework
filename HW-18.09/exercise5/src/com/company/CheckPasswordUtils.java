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
    public static int lowerCaseCheck(String passwordToCheck) {
        int lowerCaseLetters = 0;
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isLowerCase(passwordToCheck.charAt(i)))
                lowerCaseLetters++;
        }
        return lowerCaseLetters;
    }
    public static int upperCaseCheck(String passwordToCheck) {
        int upperCaseLetters = 0;
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isUpperCase(passwordToCheck.charAt(i)))
                upperCaseLetters++;
        }
        return upperCaseLetters;
    }
    static boolean isValid(int length, int digits, int letters, int lowerCaseLetters, int upperCaseLetters){
        return (length >= 6 && digits >= 1 && digits + letters == length
                && lowerCaseLetters >= 1
                && upperCaseLetters >= 1);
    }
}