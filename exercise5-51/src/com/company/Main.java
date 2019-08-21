package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String a = in.nextLine();
        System.out.println("Enter the second string:");
        String b = in.nextLine();
        String common = "";
        for(int i = 0; i < a.length() && i < b.length(); i++){
            if (a.charAt(i) == b.charAt(i))
                common += a.charAt(i);
        }
        if(common.trim().isEmpty())
        System.out.printf("%s and %s have no common prefix\n", a , b);
        else
        System.out.println("The common prefix is " + common);

    }
}
