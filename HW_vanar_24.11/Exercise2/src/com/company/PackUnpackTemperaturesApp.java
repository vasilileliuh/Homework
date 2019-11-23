package com.company;

import java.util.Scanner;

public class PackUnpackTemperaturesApp {

    private static final int WEEK_DAYS = 7;

    public static void main(String[] args) {

        unpackTemperatures(packTemperatures(-5, 5, 0, -5, 5, 0, -5));
    }

    static String packTemperatures(int t1, int t2, int t3, int t4, int t5, int t6, int t7) {
        return "" + t1 + " " + t2 + " " + t3 + " " + t4 + " " + t5 + " " + t6 + " " + t7;
    }

    static double avgTemperature(int t1, int t2, int t3, int t4, int t5, int t6, int t7) {
        return (double) (t1 + t2 + t3 + t4 + t5 + t6 + t7) / WEEK_DAYS;
    }

    static void unpackTemperatures(String data) {
        Scanner in = new Scanner(data);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();
        int t4 = in.nextInt();
        int t5 = in.nextInt();
        int t6 = in.nextInt();
        int t7 = in.nextInt();
        System.out.printf("Average week temperature is: %.1f degree Celsius.", avgTemperature(t1, t2, t3, t4, t5, t6, t7));
    }
}
