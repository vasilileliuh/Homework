package home;

import ingredients.CoffeePowder;
import ingredients.Sugar;
import ingredients.Water;

public class Coffee {
    private Sugar sugar;
    private Water water;
    private CoffeePowder coffeePowder;

    public Coffee() {
        sugar = new Sugar();
        sugar.setGrammes(20);
        water = new Water();
        water.setMilliliters(200);
        coffeePowder = new CoffeePowder();
        coffeePowder.setGrammes(80);
    }

    public Coffee(Sugar sugar, Water water, CoffeePowder coffeePowder) {
        this.sugar = sugar;
        this.water = water;
        this.coffeePowder = coffeePowder;
    }

    @Override
    public String toString() {
        return "{ Sugar = " + sugar.getGrammes() + " grammes," +
                " Water = " + water.getMilliliters() + " milliliters," +
                " CoffeePowder = " + coffeePowder.getGrammes() + " grammes" +
                " }";
    }
}
