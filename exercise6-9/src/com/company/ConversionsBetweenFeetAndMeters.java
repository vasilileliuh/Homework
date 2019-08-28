package com.company;

public class ConversionsBetweenFeetAndMeters {

    public static void main(String[] args){

        System.out.println();
        System.out.println("\033[4mFeet    Meters    |     Meters      Feet   \033[0m");

        for (double foot = 1, meter = 20; foot <= 10; foot++, meter += 5){
                System.out.printf("%-8.1f%-6.3f    |     ", foot, MetricImperialUnitsConverter.footToMeter(foot));
                System.out.printf("%-11.1f%8.3f\n", meter, MetricImperialUnitsConverter.meterToFoot(meter));
        }
    }


}