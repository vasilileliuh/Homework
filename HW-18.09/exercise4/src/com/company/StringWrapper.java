package com.company;

class StringWrapper {

    private String givenString;

    StringWrapper(String givenString) {
        this.givenString = givenString;
    }

    int getNumberOfConsonants() {
        return StringUtilities.countConsonants(this.givenString);
    }

    int getNumberOfVowels() {
        return StringUtilities.countVowels(this.givenString);
    }

    static void showMenu() {
        System.out.println("<< MENU >>");
        System.out.println("a. Count the number of vowels in the string.");
        System.out.println("b. Count the number of consonants in the string.");
        System.out.println("c. Count both the vowels and consonants in the string.");
        System.out.println("d. Enter another string.");
        System.out.println("e. Show the MENU again.");
        System.out.println("f. Exit the program.");
    }
}
