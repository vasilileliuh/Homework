package com.company;

public class DataWrapApp {

    public static void main(String[] args) {
        System.out.println(DataWrapper.wrapRound("Test Round wrapper"));
        System.out.println("Integer overloading variant: " + DataWrapper.wrapRound(125));
        System.out.println("Double overloading variant: " + DataWrapper.wrapRound(125.5));
        System.out.println("Char overloading variant: " + DataWrapper.wrapRound('$'));
        System.out.println();
        System.out.println(DataWrapper.wrapSquare("Test Square wrapper"));
        System.out.println("Integer overloading variant: " + DataWrapper.wrapSquare(125));
        System.out.println("Double overloading variant: " + DataWrapper.wrapSquare(125.5));
        System.out.println("Char overloading variant: " + DataWrapper.wrapSquare('$'));
        System.out.println();
        System.out.println(DataWrapper.wrapAngle("Test Angle wrapper"));
        System.out.println("Integer overloading variant: " + DataWrapper.wrapAngle(125));
        System.out.println("Double overloading variant: " + DataWrapper.wrapAngle(125.5));
        System.out.println("Char overloading variant: " + DataWrapper.wrapAngle('$'));
        System.out.println();
        System.out.println(DataWrapper.wrapSquare("array"));
        System.out.println(DataWrapper.wrapAngle("tag"));
        System.out.println(DataWrapper.wrapRound(0.5));
    }
}

class DataWrapper {

    static String wrapRound(String text) {
        return "(" + text + ")";
    }

    static String wrapRound(int number) {
        return "(" + number + ")";
    }

    static String wrapRound(double number) {
        return "(" + number + ")";
    }

    static String wrapRound(char symbol) {
        return "(" + symbol + ")";
    }

    static String wrapSquare(String text) {
        return "[" + text + "]";
    }

    static String wrapSquare(int number) {
        return "[" + number + "]";
    }

    static String wrapSquare(double number) {
        return "[" + number + "]";
    }

    static String wrapSquare(char symbol) {
        return "[" + symbol + "]";
    }

    static String wrapAngle(String text) {
        return "<" + text + ">";
    }

    static String wrapAngle(int number) {
        return "<" + number + ">";
    }

    static String wrapAngle(double number) {
        return "<" + number + ">";
    }

    static String wrapAngle(char symbol) {
        return "<" + symbol + ">";
    }


}
