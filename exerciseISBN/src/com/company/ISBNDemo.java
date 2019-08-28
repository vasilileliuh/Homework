package com.company;

public class ISBNDemo {
    public static void main(String[] args) {

        ISBNChecker i = new ISBNChecker();

        System.out.println(i.computeFullLengthISBN("123456789123"));

        System.out.println(i.computeFullLengthISBN("978013213080"));

        System.out.println(i.computeFullLengthISBN("97801321308"));

        System.out.println(i.computeFullLengthISBN("9780132130899"));

    }
}
