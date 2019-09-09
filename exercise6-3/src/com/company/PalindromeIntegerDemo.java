package com.company;

import java.util.Scanner;

public class PalindromeIntegerDemo {

    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (PalindromeUtils.isPalindrome(number))
        PalindromeUtils.printMessageWithCheckedResult(" is a palindrome", number);
        else
        PalindromeUtils.printMessageWithCheckedResult(" is not a palindrome", number);
    }

}
