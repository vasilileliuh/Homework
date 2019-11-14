package com.company;

import java.io.IOException;

public class ValidatorPINApp {

    public static void main(String[] args) throws IOException {

        final int VALID_PIN = 1234;
        int scannedPin;
        byte oneSymbolByte;
        char oneSymbolChar;
        String textPIN = "";

        System.out.print("Enter your PIN: ");

        for (int i = 1; i <= 4; i++) {
            int inChar = System.in.read();
            oneSymbolByte = (byte) inChar;
            oneSymbolChar = (char) oneSymbolByte;
            textPIN += oneSymbolChar;
        }

        scannedPin = Integer.parseInt(textPIN);
        System.out.println("Account accessible? " + (VALID_PIN == scannedPin));
    }
}
