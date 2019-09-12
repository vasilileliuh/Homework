package com.company;

class IntegerUtil {

    public static String format(int number, int width) {

        String result = "";
        if (width > countDigits(number)) {
            int quantityOfZeros = width - countDigits(number);
            for (int i = 1; i <= quantityOfZeros; i++) {
                result = result + "0";
            }
            return result + number;
        } else
            return String.valueOf(number);
    }

    static int countDigits(int number) {
        int counterOfDigits = 0;
        for (; number > 0; ) {
            number = number / 10;
            counterOfDigits++;
        }
        return counterOfDigits;
    }

}
