package com.company;

public class DataFlowApp {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Integer to byte: -128 = " + DataTransformer.integerToByte(-129));
        System.out.println(DataTransformer.byteToInteger((byte) 125));
        System.out.println("Double to integer: 2200000000.0 = " + DataTransformer.doubleToInteger(2200000000.0));
        DataTransformer.integerToDouble(150000);
        DataTransformer.shortToInteger((short) 32000);
        System.out.println("Integer to short: 640000 = " + DataTransformer.integerToShort(640000));
        System.out.println("Double to short through integer: 1.45 = " + DataTransformer.integerToShort(DataTransformer.doubleToInteger(1.45)));

    }
}

class DataTransformer {

    static byte integerToByte(int value) {
        if (value < -128 || value > 127)
            System.err.println("WARNING! the value \"" + value + "\" overflows \"byte\" range. DATA will was lost!");
        return (byte) value;
    }

    static int byteToInteger(byte value) {
        return (int) value;
    }

    static int doubleToInteger(double value) {
        if (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE)
            System.err.println("WARNING! the value \"" + value + "\" overflows \"int\" range. DATA will was lost!");
        return (int) Math.round(value);
    }

    static double integerToDouble(int value) {
        return (double) value;
    }

    static int shortToInteger(short value) {
        return (int) value;
    }

    static short integerToShort(int value) {
        if (value < Short.MIN_VALUE || value > Short.MAX_VALUE)
            System.err.println("WARNING! the value \"" + value + "\" overflows \"short\" range. DATA will was lost!");
        return (short) value;
    }

/*    static short doubleToShort(double value) {
        if (value < Short.MIN_VALUE || value > Short.MAX_VALUE)
            System.err.println("WARNING! the value \"" + value + "\" overflows \"short\" range. DATA will was lost!");
        return (short) Math.round(value);
    }*/
}