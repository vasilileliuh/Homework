package com.company;

public class SumTheDigitsUtil {

    public static int quantityOfDigits(long n) {
        int sum = 0; long oneDigit;
        while (n > 0) {
            oneDigit = n % 10;
            sum = sum + (int)oneDigit;
            n = n / 10;
        }
        return sum;
    }
}
