package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Enter five numbers between 1 and 30.");
        System.out.println();
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        int number4 = in.nextInt();
        int number5 = in.nextInt();

                if ((number1 <= 0 || number1 > 30))
                    System.out.println("Please enter correct first number");
                    
                else if ((number2 <= 0 || number2 > 30))
                    System.out.println("Please enter correct second number");

                else if ((number3 <= 0 || number3 > 30))
                    System.out.println("Please enter correct third number");

                else if ((number4 <= 0 || number4 > 30))
                    System.out.println("Please enter correct fourth number");

                else if ((number5 <= 0 || number5 > 30))
                            System.out.println("Please enter correct fifth number");

                else {
                            printChart(number1);
                            printChart(number2);
                            printChart(number3);
                            printChart(number4);
                            printChart(number5);
                        }
                    }


    private static void printChart(int numberOfStars) {
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();

    }
}








//        if ((num <= 0 || num > 30) || (num1 <= 0 || num1 > 30) || (num2 <= 0 || num2 > 30) || (num3 <= 0 || num3 > 30) ||(num4 <= 0 || num4 > 30))
//            System.out.println("Please enter correct number between 1 and 30");
//        else {
//            for (int j = 1; j <= num; ++j) {
//                int i = 1;
//                while (i <= j)
//                    i++;
//                System.out.print("*");
//            }
//            System.out.println();
//            for (int j = 1; j <= num1; ++j) {
//                int i = 1;
//                while (i <= j)
//                    i++;
//                System.out.print("*");
//            }
//            System.out.println();
//            for (int j = 1; j <= num2; ++j) {
//                int i = 1;
//                while (i <= j)
//                    i++;
//                System.out.print("*");
//            }
//            System.out.println();
//            for (int j = 1; j <= num3; ++j) {
//                int i = 1;
//                while (i <= j)
//                    i++;
//                System.out.print("*");
//            }
//            System.out.println();
//            for (int j = 1; j <= num4; ++j) {
//                int i = 1;
//                while (i <= j)
//                    i++;
//                System.out.print("*");
//            }
//        }
//    }
//}


