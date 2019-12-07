package home;

public class Kitchen {
    private Table table;

    public Kitchen(Table table) {
        this.table = table;
    }

    public Kitchen() {
        table = new Table();
    }

    @Override
    public String toString() {
        return "{ Table = " + table + " }";
    }
}
