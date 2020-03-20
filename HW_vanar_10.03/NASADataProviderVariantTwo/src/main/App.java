package main;

import providers.NASADataProvider;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter start/end dates YYYY-MM-DD: ");
//        String startDate = in.next(), endDate = in.next();
        String startDate = "2020-03-07", endDate = "2020-03-08";

        new NASADataProvider().getNeoAsteroids(startDate, endDate);

    }
}
