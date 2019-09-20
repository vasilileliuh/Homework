package com.company;

public class WordSeparatorUtils {

    static String upperCaseVerifier(String unspacedSentence) {

        String spacedSentence = "";

        for (int i = 0; i < unspacedSentence.length() - 1; i++) {
            if (i == 0) {
                spacedSentence += unspacedSentence.substring(i, i + 1).toUpperCase();
                spacedSentence += unspacedSentence.substring(i + 1, i + 2);
            } else if (Character.isLowerCase(unspacedSentence.charAt(i)) && Character.isUpperCase(unspacedSentence.charAt(i + 1))) {
                spacedSentence += " ";
                spacedSentence += unspacedSentence.substring(i + 1, i + 2).toLowerCase();
            } else {
                spacedSentence += unspacedSentence.substring(i + 1, i + 2);
            }

        }
        return spacedSentence;
    }
}
