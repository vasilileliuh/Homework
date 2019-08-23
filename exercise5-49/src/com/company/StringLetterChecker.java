package com.company;

public class StringLetterChecker {
    static int countVowelLetters(String stringToCheck) {
        int numberOfVowels = 0;
        for (int i = 0; i < stringToCheck.length(); i++) {
            if (isVowel(stringToCheck.toLowerCase().charAt(i)))
                numberOfVowels++;
        }
        return numberOfVowels;
    }

    static int countConsonantLetters(String stringToCheck) {
        int numberOfConsonants = 0;
        for (int i = 0; i < stringToCheck.length(); i++) {
            if (isConsonant(stringToCheck.toLowerCase().charAt(i)))
                numberOfConsonants++;
        }
        return numberOfConsonants;
    }

    static boolean isVowel(char c){
      return c == 'a' || c == 'e' ||c == 'i' || c == 'o' || c == 'u';
    }

    static boolean isConsonant(char c){
        return c == 'q' || c == 'w' || c == 'r' || c == 't' || c == 'y'
                || c == 'p' || c == 's' || c == 'd' || c == 'f'
                || c == 'g' || c == 'h' || c == 'j' || c == 'k'
                || c == 'l' || c == 'z' || c == 'x' || c == 'c'
                || c == 'v' || c == 'b' || c == 'n' || c == 'm';
    }


}