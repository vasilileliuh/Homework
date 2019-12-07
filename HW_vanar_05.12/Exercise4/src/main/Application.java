package main;

import home.Coffee;
import home.Cup;
import home.Kitchen;
import home.Table;
import ingredients.CoffeePowder;
import ingredients.Sugar;
import ingredients.Water;

public class Application {
    public static void main(String[] args) {

        Sugar sugar = new Sugar(35);
        System.out.println("Sugar = " + sugar.toString());
        Water water = new Water(250);
        System.out.println("Water = " + water.toString());
        CoffeePowder coffeePowder = new CoffeePowder(110);
        System.out.println("Coffee Powder = " + coffeePowder.toString());

        System.out.println();
        Coffee coffee = new Coffee();
        System.out.println("Coffee default = " + coffee.toString());
        Coffee coffee1 = new Coffee(sugar, water, coffeePowder);
        System.out.println("Coffee1 = " + coffee1.toString());
        Coffee coffee2 = new Coffee(new Sugar(40), new Water(255), new CoffeePowder(112));
        System.out.println("Coffee2 = " + coffee2.toString());

        System.out.println();
        Cup cup = new Cup();
        System.out.println("Cup = " + cup.toString());

        System.out.println();
        Kitchen kitchen = new Kitchen();
        System.out.println("Kitchen default = " + kitchen.toString());

        System.out.println();
        Kitchen kitchen1 = new Kitchen(new Table(new Cup(new Coffee(new Sugar(17), new Water(185), new CoffeePowder(98)))));
        System.out.println("Kitchen1 = " + kitchen1.toString());
    }
}
