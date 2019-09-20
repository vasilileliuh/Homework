package com.company;

class StringUtilities {

    static int countVowels(String givenString) {
        int vowelCounter = 0;
        for (int i : givenString.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }

    static int countConsonants(String givenString) {
        int consonantCounter = 0;
        for (int i = 0; i < givenString.length(); i++) {
            if (givenString.toCharArray()[i] == 'q' || givenString.toCharArray()[i] == 'w' || givenString.toCharArray()[i] == 'r' || givenString.toCharArray()[i] == 't' || givenString.toCharArray()[i] == 'y' || givenString.toCharArray()[i] == 'p'
                    || givenString.toCharArray()[i] == 's' || givenString.toCharArray()[i] == 'd' || givenString.toCharArray()[i] == 'f' || givenString.toCharArray()[i] == 'g' || givenString.toCharArray()[i] == 'h' || givenString.toCharArray()[i] == 'j' || givenString.toCharArray()[i] == 'k'
                    || givenString.toCharArray()[i] == 'l' || givenString.toCharArray()[i] == 'z' || givenString.toCharArray()[i] == 'x' || givenString.toCharArray()[i] == 'c' || givenString.toCharArray()[i] == 'v' || givenString.toCharArray()[i] == 'b' || givenString.toCharArray()[i] == 'n'
                    || givenString.toCharArray()[i] == 'm') {
                consonantCounter++;
            }
        }
        return consonantCounter;
    }
}

