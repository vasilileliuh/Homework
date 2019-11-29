package com.company;

public class RestaurantChoosingApp {

    public static void main(String[] args) {

        VeganRestaurant.Info.printMenu();
        System.out.println();
        SushiRestaurant.Info.printMenu();

    }

    static void printName(String restaurantName) {
        System.out.printf("########### %21s ###########%n", restaurantName);
    }

    static void printAddress(String restaurantAddress) {
        System.out.printf("-- %-31s         --%n", restaurantAddress);
    }

}

// ###################### RESTAURANT CLASSES ##########################
class VeganRestaurant extends RestaurantChoosingApp {
    private final static double MENU_DISCOUNT_COEFFICIENT = 0.95;
    private final static double SPECIAL_MENU_DISCOUNT_COEFFICIENT = 0.9;
    private final static int MENU_PRICE = 50;
    private final static int SPECIAL_MENU_PRICE = 200;

    static class Info {

        static void printMenu() {
            printName("Vegan Pure Restaurant");
            printAddress("UpTown Str 77/B, Maxicity");
            System.out.printf("MENU          x 1  portion          %.2f MDL%n", Menu.getPrice());
            int menuQuantity = 5;
            System.out.printf("MENU          x %d  portion(-%2.0f%%)   %.2f MDL%n", menuQuantity, (1.0 - MENU_DISCOUNT_COEFFICIENT) * 100, Menu.getPrice(menuQuantity));
            System.out.printf("SPECIAL MENU  x 1  portion         %.2f MDL%n", SpecialMenu.getPrice());
            int specialMenuQuantity = 10;
            System.out.printf("SPECIAL MENU  x %d portion(-%2.0f%%)  %.2f MDL%n", specialMenuQuantity, (1.0 - SPECIAL_MENU_DISCOUNT_COEFFICIENT) * 100, SpecialMenu.getPrice(specialMenuQuantity));
        }

    }

    static class Menu {

        static double getPrice() {
            return MENU_PRICE;
        }

        static double getPrice(int portions) {
            return portions * getPrice() * MENU_DISCOUNT_COEFFICIENT;

        }
    }

    static class SpecialMenu {
        static double getPrice() {
            return SPECIAL_MENU_PRICE;
        }

        static double getPrice(int portions) {
            return portions * getPrice() * SPECIAL_MENU_DISCOUNT_COEFFICIENT;

        }
    }
}

class SushiRestaurant extends RestaurantChoosingApp {
    private final static double MENU_DISCOUNT_COEFFICIENT = 0.9;
    private final static double SPECIAL_MENU_DISCOUNT_COEFFICIENT = 0.8;
    private final static int MENU_PRICE = 100;
    private final static int SPECIAL_MENU_PRICE = 300;

    static class Info {
        static void printMenu() {
            printName("Sushi Mini Restaurant");
            printAddress("DownTown Str 88/A, Minicity");
            System.out.printf("MENU          x 1  portion         %.2f MDL%n", Menu.getPrice());
            int menuQuantity = 5;
            System.out.printf("MENU          x %d  portion(-%2.0f%%)   %.2f MDL%n", menuQuantity, (1.0 - MENU_DISCOUNT_COEFFICIENT) * 100, Menu.getPrice(menuQuantity));
            System.out.printf("SPECIAL MENU  x 1  portion         %.2f MDL%n", SpecialMenu.getPrice());
            int specialMenuQuantity = 10;
            System.out.printf("SPECIAL MENU  x %d portion(-%2.0f%%)  %.2f MDL%n", specialMenuQuantity, (1.0 - SPECIAL_MENU_DISCOUNT_COEFFICIENT) * 100, SpecialMenu.getPrice(specialMenuQuantity));

        }
    }

    static class Menu {

        static double getPrice() {
            return MENU_PRICE;
        }

        static double getPrice(int portions) {
            return portions * getPrice() * MENU_DISCOUNT_COEFFICIENT;

        }
    }

    static class SpecialMenu {
        static double getPrice() {
            return SPECIAL_MENU_PRICE;
        }

        static double getPrice(int portions) {
            return portions * getPrice() * SPECIAL_MENU_DISCOUNT_COEFFICIENT;

        }
    }
}