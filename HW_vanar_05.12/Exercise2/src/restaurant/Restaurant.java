package restaurant;

public class Restaurant {
    // properties
    private String name;
    private Table tableNearWindow;
    private Table tableNearDoors;
    private Table tableNearBathroom;


    // constructor
    public Restaurant(String name) {
        this.name = name;
    }

    public void setTable(Table table, int number) {
        if (number == 1)
            tableNearWindow = table;
        else if (number == 2)
            tableNearDoors = table;
        else if (number == 3)
            tableNearBathroom = table;
        else
            System.err.println("Only three tables available!");
    }

    public boolean isFree() {
        return tableNearWindow == null && tableNearDoors == null && tableNearBathroom == null;
    }

    public Table getTable(int number) {
        if (number == 1)
            return tableNearWindow;
        else if (number == 2)
            return tableNearDoors;
        else
            return tableNearBathroom;
    }

    public void printInfo() {
        System.out.println("RESTAURANT: " + name);
        System.out.println("##################################");
        System.out.println();
        tableNearWindow.printInfo();
        tableNearDoors.printInfo();
        tableNearBathroom.printInfo();
    }

}
