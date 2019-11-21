package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawCakeWithForApp {

    public static void main(String[] args) throws IOException {

        final int SMOKE = 1;
        final int FIRE = 2;
        final int CANDLE = 3;
        final int CREAM = 4;
        final int BASE = 5;
        final short CAKE_LAYERS = 5;

        short cakeWidth;

        System.out.println("Enter cake width: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        cakeWidth = Short.parseShort(reader.readLine());

        for (short level = 1; level <= CAKE_LAYERS; level++) {
            switch (level) {
                case SMOKE:
                    for (int lines = 1; lines <= 2; lines++) {
                        for (int elements = 1; elements <= cakeWidth / 2; elements++) {
                            System.out.print(" .");
                        }
                        System.out.println();
                    }
                    break;
                case FIRE:
                    for (int elements = 1; elements <= cakeWidth / 2; elements++)
                        System.out.print(" ^");
                    System.out.println();
                    break;
                case CANDLE:
                    for (int elements = 1; elements <= cakeWidth / 2; elements++)
                        System.out.print(" |");
                    System.out.println();
                    break;
                case CREAM:
                    for (int elements = 1; elements <= cakeWidth; elements++)
                        System.out.print("~");
                    System.out.println();
                    break;
                case BASE:
                    for (int lines = 1; lines <= 3; lines++) {
                        for (int elements = 1; elements <= cakeWidth; elements++) {
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                    break;
            }
        }


    }
}