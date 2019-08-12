import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the speed of the vehicle (in miles per hour) " +
                "and the number of hours it has travelled:");
        Scanner in = new Scanner(System.in);
        int firstDigitSpeed = in.nextInt();
        int secondDigitHours = in.nextInt();

        System.out.println("Hour          Distance Travelled");
        System.out.println("- - - - - - - - - - - - - - - - -");
        int program = 0;
        for (int i = 1; i <= secondDigitHours; i++) {
            program = firstDigitSpeed * i;
            System.out.printf("%d                %d \n", i, program);

        }
    }
}

