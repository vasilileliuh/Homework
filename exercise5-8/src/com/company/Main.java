package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter several numbers of student's names and score . First integer will indicate the number of students to input.");
        Scanner in = new Scanner(System.in);
        int numberOfInputs = in.nextInt();
        int highestScore = Integer.MIN_VALUE;
        String winnerName="Not a name";
        for (int i = 1; i <= numberOfInputs; i++) {
            in.nextLine();
            System.out.println("Enter students name:");
            String name = in.nextLine();
            System.out.println("Enter students score:");
            int nextNumber = in.nextInt();
            if (highestScore < nextNumber) {
                highestScore = nextNumber;
                winnerName = name;
            }
        }
        System.out.printf("The highest score have student %s with %d points  \n", winnerName, highestScore);

    }
}