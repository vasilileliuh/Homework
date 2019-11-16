package com.company;

import java.util.Scanner;

public class RestaurantApp {

    public static void main(String[] args) {

        final String CURRENCY = "MDL";
        final int DELIVERY_PRICE = 50;
        final int FREE_DELIVERY_ELIGIBLE_SUM = 200;

        final String FOOD_1_NAME = "\"Pizza\"";
        final float FOOD_1_PRICE = 75.5f;
        int foodOneAvailableQuantity = 10;

        final String FOOD_2_NAME = "\"Mamaliga\"";
        final float FOOD_2_PRICE = 150f;
        int foodTwoAvailableQuantity = 5;

        final String FOOD_3_NAME = "\"Salad\"";
        final float FOOD_3_PRICE = 30f;
        int foodThreeAvailableQuantity = 8;

        int userChoiceFoodAvailableQuantity = 0;
        String userChoiceFoodName = "";
        float userChoiceFoodPrice = 0f;
        boolean condition = true;
        int option;

        System.out.printf("\n********* MENU **********\n" +
                        "1. %-10s %7.2f %s\n" +
                        "2. %-10s %7.2f %s\n" +
                        "3. %-10s %7.2f %s\n" +
                        "*************************\n\n",
                FOOD_1_NAME, FOOD_1_PRICE, CURRENCY,
                FOOD_2_NAME, FOOD_2_PRICE, CURRENCY,
                FOOD_3_NAME, FOOD_3_PRICE, CURRENCY);

        System.out.print("CHOOSE AN OPTION >>> ");

        Scanner in = new Scanner(System.in);

        while (condition) {
            option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Your choise is: " + FOOD_1_NAME);
                    userChoiceFoodAvailableQuantity = foodOneAvailableQuantity;
                    userChoiceFoodName = FOOD_1_NAME;
                    userChoiceFoodPrice = FOOD_1_PRICE;
                    condition = false;
                    break;
                case 2:
                    System.out.println("Your choise is: " + FOOD_2_NAME);
                    userChoiceFoodAvailableQuantity = foodTwoAvailableQuantity;
                    userChoiceFoodName = FOOD_2_NAME;
                    userChoiceFoodPrice = FOOD_2_PRICE;
                    condition = false;
                    break;
                case 3:
                    System.out.println("Your choise is: " + FOOD_3_NAME);
                    userChoiceFoodAvailableQuantity = foodThreeAvailableQuantity;
                    userChoiceFoodName = FOOD_3_NAME;
                    userChoiceFoodPrice = FOOD_3_PRICE;
                    condition = false;
                    break;
                default:
                    System.out.println("Wrong enter. Please choose among 1,2 or 3 ");
            }
        }

        System.out.print("How many do you want ? ");

        int optionQuantity = in.nextInt();

        if (optionQuantity <= userChoiceFoodAvailableQuantity) {
            System.out.printf("Your ORDER is: %d x %s  (%.2f%s) = %.2f %s%n",
                    optionQuantity, userChoiceFoodName, userChoiceFoodPrice,
                    CURRENCY, optionQuantity * userChoiceFoodPrice, CURRENCY);
            System.out.println("Confirm order ( 1 - yes, 0 - no )? ");

            option = userInput();

            if (option == 1) {
                System.out.println("THANK YOU!");
                System.out.print("Do you need delivery service?\n");
                if (optionQuantity * userChoiceFoodPrice < FREE_DELIVERY_ELIGIBLE_SUM) {
                    System.out.printf("Delivery will cost you extra %d%s%n", DELIVERY_PRICE, CURRENCY);
                } else
                    System.out.println("Delivery is free of charge.");
                System.out.println("Confirm order ( 1 - yes, 0 - no )?");

                option = userInput();

                if (option == 1 && optionQuantity * userChoiceFoodPrice < FREE_DELIVERY_ELIGIBLE_SUM)
                    System.out.printf("Your ORDER is: %d x %s (%.2f%s) + delivery (%d%s) = %.2f %s%n",
                            optionQuantity, userChoiceFoodName, userChoiceFoodPrice, CURRENCY, DELIVERY_PRICE,
                            CURRENCY, optionQuantity * userChoiceFoodPrice + DELIVERY_PRICE, CURRENCY);
                System.out.println("THANK YOU!");
            }
        } else
            System.out.printf("You've ordered too many %s, we only have %d\nPLEASE TRY AGAIN!", userChoiceFoodName, userChoiceFoodAvailableQuantity);
    }

    private static int userInput() {
        Scanner in = new Scanner(System.in);
        int option;
        do {
            option = in.nextInt();
            if (option != 1 && option != 0)
                System.out.println("Wrong enter. Please choose among 0 and 1");
        } while (option != 1 && option != 0);
        return option;
    }
}