package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string:");
        String a = in.nextLine();
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < a.length(); i++){
            if (a.toLowerCase().charAt(i) == 'a' || a.toLowerCase().charAt(i) == 'e' || a.toLowerCase().charAt(i) =='i' || a.toLowerCase().charAt(i) == 'o' || a.toLowerCase().charAt(i) == 'u')
                vowels++;
        else if(a.toLowerCase().charAt(i) != ' ')
                 consonants++;
    }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
