package ingredients;

public class Water {
    private int milliliters; // volume in milliliters

    public Water() {

    }

    public Water(int milliliters) {
        this.milliliters = milliliters;
    }

    public int getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(int milliliters) {
        this.milliliters = milliliters;
    }

    @Override
    public String toString() {
        return "{ milliliters = " + milliliters + " }";
    }
}
