package com.company;

public class GameCrapsDemo {

    public static void main(String[] args) {
        int firstDiceThrowResult = GameCraps.diceThrowResult();
        int secondDiceThrowResult = GameCraps.diceThrowResult();
        int setPoint;
        boolean replaying;
        if (GameCraps.isNatural(firstDiceThrowResult, secondDiceThrowResult)) {
            System.out.println("You rolled " + firstDiceThrowResult + " + " + secondDiceThrowResult + " = " + GameCraps.getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult));
            System.out.println("You win");
        } else if (GameCraps.isCraps(firstDiceThrowResult, secondDiceThrowResult)) {
            System.out.println("You rolled " + firstDiceThrowResult + " + " + secondDiceThrowResult + " = " + GameCraps.getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult));
            System.out.println("You lose");
        } else {
            System.out.println("You rolled " + firstDiceThrowResult + " + " + secondDiceThrowResult + " = " + GameCraps.getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult));
            setPoint = GameCraps.getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult);
            System.out.println("Point is " + setPoint);
            do {
                firstDiceThrowResult = GameCraps.diceThrowResult();
                secondDiceThrowResult = GameCraps.diceThrowResult();
                if (GameCraps.isSeven(firstDiceThrowResult, secondDiceThrowResult)) {
                    System.out.println("You rolled " + firstDiceThrowResult + " + " + secondDiceThrowResult + " = " + GameCraps.getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult));
                    System.out.println("You lose");
                    replaying = false;
                } else if (GameCraps.isTheSameSetPointValue(firstDiceThrowResult, secondDiceThrowResult, setPoint)) {
                    System.out.println("You rolled " + firstDiceThrowResult + " + " + secondDiceThrowResult + " = " + GameCraps.getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult));
                    System.out.println("You win");
                    replaying = false;
                } else {
                    System.out.println("You rolled " + firstDiceThrowResult + " + " + secondDiceThrowResult + " = " + GameCraps.getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult));
                    replaying = true;
                }
            } while (replaying);
        }
    }
}
