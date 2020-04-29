package main;

import collections.SimplePositiveQueue;

public class Application {
    public static void main(String[] args) {
        SimplePositiveQueue spq = new SimplePositiveQueue();
        spq.push(1000);
        System.out.println("Length = " + spq.getLength());
        spq.push(2000);
        System.out.println("Length = " + spq.getLength());
        spq.push(0);
        System.out.println("Length = " + spq.getLength());
        if (!spq.push(4000)) {
            System.out.println("The queue is full!!");
        }

        int value;
        do {
            value = spq.poll();
            System.out.println(value);
            System.out.println("Length = " + spq.getLength());
        } while (value != -1);
    }
}
