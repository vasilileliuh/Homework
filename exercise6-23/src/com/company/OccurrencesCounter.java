package com.company;

public class OccurrencesCounter {
    public static int count(String str, char a) {
        int numberOfOccurrences = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.toLowerCase().charAt(i))
                numberOfOccurrences++;
        }
        return numberOfOccurrences;
    }
}
