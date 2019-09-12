package com.company;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter today's sales for store 1: ");
        int store1 = in.nextInt();
        System.out.print("Enter today's sales for store 2: ");
        int store2 = in.nextInt();
        System.out.print("Enter today's sales for store 3: ");
        int store3 = in.nextInt();
        System.out.print("Enter today's sales for store 4: ");
        int store4 = in.nextInt();
        System.out.print("Enter today's sales for store 5: ");
        int store5 = in.nextInt();
        System.out.println();
        System.out.println("SALES BAR CHART");
        System.out.print("Store 1: ");
        BarChartUtil.asterisksPrinter(store1);
        System.out.print("Store 2: ");
        BarChartUtil.asterisksPrinter(store2);
        System.out.print("Store 3: ");
        BarChartUtil.asterisksPrinter(store3);
        System.out.print("Store 4: ");
        BarChartUtil.asterisksPrinter(store4);
        System.out.print("Store 5: ");
        BarChartUtil.asterisksPrinter(store5);

    }
}
