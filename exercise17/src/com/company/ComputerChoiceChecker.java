package com.company;

import java.util.Random;

public class ComputerChoiceChecker {

    static int findComputerChoice(int variants) {
        Random rand = new Random();
        int computerChoiceInNumber = rand.nextInt(variants);
        computerChoiceInNumber += 1;
        return computerChoiceInNumber;
    }

    static String readComputerChoice(int computerChoiceInNumber) {
        String computerChoiceInString = "";
        switch (computerChoiceInNumber) {
            case 1:
                computerChoiceInString = "Rock";
                break;
            case 2:
                computerChoiceInString = "Paper";
                break;
            case 3:
                computerChoiceInString = "Scissors";
                break;
        }
        return computerChoiceInString;
    }
}
