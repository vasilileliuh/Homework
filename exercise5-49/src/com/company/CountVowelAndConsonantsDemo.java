package com.company;

import java.util.Scanner;

public class CountVowelAndConsonantsDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String stringToCheck = in.nextLine();


        System.out.println("The number of vowels is " + StringLetterChecker.countVowelLetters(stringToCheck));
        System.out.println("The number of consonants is " + StringLetterChecker.countConsonantLetters(stringToCheck));
        System.out.println(StringLetterChecker.isConsonant('d'));
        System.out.println(StringLetterChecker.isConsonant('e'));
    }
}


