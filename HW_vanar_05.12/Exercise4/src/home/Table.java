package home;

public class Table {
    private Cup cup;

    public Table(Cup cup) {
        this.cup = cup;
    }

    Table() {
        cup = new Cup();
    }

    @Override
    public String toString() {
        return "{ Cup = " + cup + " }";
    }
}
