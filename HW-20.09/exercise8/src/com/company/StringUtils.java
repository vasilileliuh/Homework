package com.company;

public class StringUtils {

    static int sumOfIntegers(String userString) {
        int count, sum = 0;
        for (int i = 0; i < userString.length(); i = i + count + 1) {
            count = 0;
            if (Character.isDigit(userString.charAt(i))) {
                for (int j = i; j < userString.length(); j++) {
                    if (Character.isDigit(userString.charAt(j))) {
                        count++;
                    } else {
                        break;
                    }
                }
                String parsingString = userString.substring(i, i + count);
                sum = sum + Integer.parseInt(parsingString);
            }

        }
        return sum;
    }
}
