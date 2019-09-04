package com.company;

public class PentagonUtils {
    public static double area(double side){
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    return area;
    }
}
