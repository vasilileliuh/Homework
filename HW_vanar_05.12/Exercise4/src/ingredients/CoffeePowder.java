package ingredients;

public class CoffeePowder {
    private int grammes; // weight in grammes

    public CoffeePowder() {

    }

    public CoffeePowder(int grammes) {
        this.grammes = grammes;
    }

    public int getGrammes() {
        return grammes;
    }

    public void setGrammes(int grammes) {
        this.grammes = grammes;
    }

    @Override
    public String toString() {
        return "{ grammes = " + grammes + " }";
    }
}
