package ingredients;

public class Sugar {

    private int grammes; // weight in grammes

    public Sugar() {

    }

    public Sugar(int grammes) {
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
