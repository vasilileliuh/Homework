package com.company;

import java.util.Random;

public class GameCraps {
     static int diceThrowResult() {
        Random ran = new Random();
        return ran.nextInt(6) + 1;
    }

    static boolean isNatural(int firstDiceThrowResult, int secondDiceThrowResult) {
        int sum = getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult);
        return sum == 7 || sum == 11;
    }

    static boolean isCraps(int firstDiceThrowResult, int secondDiceThrowResult) {
        return getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult) == 2
                || getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult) == 3
                || getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult) == 12;
    }

    static boolean isSeven(int firstDiceThrowResult, int secondDiceThrowResult) {
        int sum = getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult);
        return sum == 7;
    }

    static boolean isTheSameSetPointValue(int firstDiceThrowResult, int secondDiceThrowResult, int setPoint) {
        return getSumOfRolledDices(firstDiceThrowResult, secondDiceThrowResult) == setPoint;
    }

    static int getSumOfRolledDices(int firstDiceThrowResult, int secondDiceThrowResult) {
        return firstDiceThrowResult + secondDiceThrowResult;
    }
}
