package com.company;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Let's play ESP game.");
        System.out.println("Computer made his choice.");
        int numberOfMatches = 0, computerChoiceInNumber;
        for (int i = 1; i <= 10; i++) {
            computerChoiceInNumber = ComputerChoiceChecker.findComputerChoice(5);
            String computerChoiceInString, userChoiceInString;
            computerChoiceInString = ComputerChoiceChecker.readComputerChoice(computerChoiceInNumber);
            System.out.println("Chose one color from: Red, Blue, Green, Orange, Yellow");
            Scanner in = new Scanner(System.in);
            userChoiceInString = in.nextLine().toLowerCase();
            userChoiceInString = ComputerChoiceChecker.readUserChoice(userChoiceInString);
            System.out.println("User had chosen " + userChoiceInString + ", computer " + computerChoiceInString);
            if (computerChoiceInString.equals(userChoiceInString))
                numberOfMatches++;
        }
        System.out.println();
        System.out.println("User guessed color " + numberOfMatches + " time(s).");
    }
}
