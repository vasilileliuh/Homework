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
                computerChoiceInString = "Red";
                break;
            case 2:
                computerChoiceInString = "Blue";
                break;
            case 3:
                computerChoiceInString = "Green";
                break;
            case 4:
                computerChoiceInString = "Orange";
                break;
            case 5:
                computerChoiceInString = "Yellow";
                break;
        }
        return computerChoiceInString;
    }

    static String readUserChoice(String userChoiceInString) {
        switch (userChoiceInString) {
            case "red":
                userChoiceInString = "Red";
                break;
            case "blue":
                userChoiceInString = "Blue";
                break;
            case "green":
                userChoiceInString = "Green";
                break;
            case "orange":
                userChoiceInString = "Orange";
                break;
            case "yellow":
                userChoiceInString = "Yellow";
                break;
            default:
                userChoiceInString = "\'wrong variant\'";
        }
        return userChoiceInString;
    }

}
