package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        boolean inputIsIncorrect = true;
        int c = '0';

        while(running){
            System.out.println("Please enter one of the following choices: ");
            System.out.println("a) carnivore            b) pianist ");
            System.out.println("c) tree                 d) game ");
            System.out.println();
            while (inputIsIncorrect){
                c = in.nextLine().toLowerCase().charAt(0);
                if (c == 'a' || c == 'b' || c == 'c' || c == 'd'){
                    inputIsIncorrect = false;
                    running = false;
                }else if (c == '$') {
                    inputIsIncorrect = false;
                    running = false;
                }else
                    System.out.println("Input not correct, enter a b c or d:");
            }
        }
        switch (c) {
            case 'a':
                System.out.printf("You choose  %c variant. \n", c);
                break;
            case 'b':
                System.out.printf("You choose  %c variant. \n", c);
                break;
            case 'c':
                System.out.printf("You choose  %c variant. \n", c);
                break;
            case 'd':
                System.out.printf("You choose  %c variant. \n", c);
                break;
            }
    }
}
