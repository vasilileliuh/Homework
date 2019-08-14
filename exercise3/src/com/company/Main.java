package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter one of the following choices: ");
        System.out.println("a) carnivore            b) pianist ");
        System.out.println("c) tree                 d) game ");
        char letter = 'z';
        do {
            String choicesABCD = in.nextLine().toLowerCase();
            letter = choicesABCD.charAt(0);
            System.out.println("Please enter character from: a, b, c or d: ");
        }
        while (letter != 'a');


        switch (letter) {
            case 'a':
                System.out.printf("You choose  %c variant. \n", letter);
                break;
            case 'b':
                System.out.printf("You choose  %c variant. \n", letter);
                break;
            case 'c':
                System.out.printf("You choose  %c variant. \n", letter);
                break;
            case 'd':
                System.out.printf("You choose  %c variant. \n", letter);
                break;
            }
    }
}
