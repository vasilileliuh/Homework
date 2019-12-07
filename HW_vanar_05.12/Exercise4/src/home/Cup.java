package home;

public class Cup {
    private Coffee coffee;

    public Cup(Coffee coffee) {
        this.coffee = coffee;
    }

    public Cup() {
        coffee = new Coffee();
    }

    @Override
    public String toString() {
        return "{ Coffee = " + coffee + " }";
    }
}
