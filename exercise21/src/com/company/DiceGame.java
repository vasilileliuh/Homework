package com.company;

import java.util.Random;



class DiceGame {

    private int numberOfComputerWins = 0;

    private int numberOfUserWins = 0;

    private int numberOfTies = 0;

    private Random r = new Random();





    public void startPlaying(int numberOfThrows) {

        for (int i = 0; i < numberOfThrows; i++) {

            checkAndIncrement();

        }

    }



    private void checkAndIncrement() {

        int computerThrowResult = r.nextInt(6) + 1;

        int userThrowResult = r.nextInt(6) + 1;



        if (computerThrowResult > userThrowResult)

            numberOfComputerWins++;

        else if (computerThrowResult < userThrowResult)

            numberOfUserWins++;

        else

            numberOfTies++;

    }



    public void printResults() {

        printScores();

        if (numberOfComputerWins + numberOfTies + numberOfUserWins > 0)

            if (numberOfComputerWins != numberOfUserWins)

                System.out.println("Grand Winner is " + ((numberOfComputerWins > numberOfUserWins)

                        ? "computer with " + numberOfComputerWins

                        : "user with " + numberOfUserWins) + " wins");

            else

                System.out.println("There is a tie! Computer with " + numberOfComputerWins + " vs User with " + numberOfUserWins);

        else

            System.out.println("Please play first! No results for you :(");

    }



    public void printScores() {

        System.out.println("User : " + numberOfUserWins);

        System.out.println("Computer : " + numberOfComputerWins);

        System.out.println("Ties : " + numberOfTies);

    }

}