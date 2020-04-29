package main;

import collections.SimpleList;

public class Application {
    public static void main(String[] args) {
        SimpleList sList = new SimpleList();
        for (int i = 0; i < 20; i++) {
            sList.add(10 + i);
        }
//
//        sList.add(10);
//        sList.add(20);
//        sList.add(30);
        System.out.println("The list has " + sList.getLength() + " elements");

        sList.print();

        System.out.println();
        System.out.println(sList.get(0));
        System.out.println(sList.get(1));
        System.out.println(sList.get(18));
        System.out.println(sList.get(19));
        System.out.println(sList.get(20));
    }
}
