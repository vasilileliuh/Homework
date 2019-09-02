package com.company;

import java.util.Scanner;

public class RockPaperScissorsGameDemo {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Let's play Rock, Paper, Scissors Game.");
        System.out.println("Computer made his choice.");
        int userChoiceInNumber, computerChoiceInNumber;
        String userChoiceInString, computerChoiceInString;
        do {
            computerChoiceInNumber = ComputerChoiceChecker.findComputerChoice(3);
            computerChoiceInString = ComputerChoiceChecker.readComputerChoice(computerChoiceInNumber);
            System.out.println("Enter your choice of \"Rock\", \"Paper\" or \"Scissors\" >");
            Scanner in = new Scanner(System.in);
            do {
                userChoiceInString = in.nextLine().toLowerCase();
                switch (userChoiceInString) {
                    case "rock":
                        userChoiceInNumber = 1;
                        userChoiceInString = "Rock";
                        break;
                    case "paper":
                        userChoiceInNumber = 2;
                        userChoiceInString = "Paper";
                        break;
                    case "scissors":
                        userChoiceInNumber = 3;
                        userChoiceInString = "Scissors";
                        break;
                    default:
                        System.out.println("Input is incorrect, please try again >");
                        userChoiceInNumber = 0;
                }
            } while (userChoiceInNumber == 0);

            if ((computerChoiceInNumber == 1 && userChoiceInNumber == 3) || (computerChoiceInNumber == 2 && userChoiceInNumber == 1) || (computerChoiceInNumber == 3 && userChoiceInNumber == 2))
                System.out.printf("Computer win with \"%s\" against \"%s\"\n", computerChoiceInString, userChoiceInString);
            if ((computerChoiceInNumber == 1 && userChoiceInNumber == 2) || (computerChoiceInNumber == 3 && userChoiceInNumber == 1) || (computerChoiceInNumber == 2 && userChoiceInNumber == 3))
                System.out.printf("User win with \"%s\" against \"%s\"\n", userChoiceInString, computerChoiceInString);
            if (computerChoiceInNumber == userChoiceInNumber)
                System.out.printf("It's draw. Computer and user' choice is \"%s\" \n", userChoiceInString);
            System.out.println("__________________________________________________");

        } while (computerChoiceInNumber == userChoiceInNumber);
    }

}
