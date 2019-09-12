package com.company;

class BarChartUtil {
    static void asterisksPrinter(int sale) {
        for (int j = 1; j <= (sale / 100); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
