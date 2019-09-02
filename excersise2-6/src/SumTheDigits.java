package com.company;

        import java.util.Scanner;

public class SumTheDigits {

        public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer between 0 and 1000: ");
        int threeDigitsInteger = in.nextInt();

            int thirdDigit = threeDigitsInteger % 10;
            int secondDigit = (threeDigitsInteger / 10) % 10;
            int firstDigit = (threeDigitsInteger / 100) % 10;

            int sum = thirdDigit + secondDigit + firstDigit;
            System.out.printf("The sum of all digits is %d\n", sum);

        }
}



