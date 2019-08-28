package com.company;

public class CharSymbolsPrinter {
    public static void printChars(char ch1, char ch2, int numberPerLine){
        System.out.println();
        for (int j = (int)ch1, i = 1; j <= (int)ch2; j++, i++) {
            System.out.print((char) j);
            if (i % numberPerLine == 0)
                System.out.println();
        }
        System.out.println();
    }
}
