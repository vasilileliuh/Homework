package restaurant;

import world.Person;

public class Table {

    private int number;
    private Person seatA;
    private Person seatB;

    public Table(int number) {
        setNumber(number);
    }

    private void setNumber(int number) {
        if (number < 1 || number > 3)
            System.err.println("No such table exists!");
        else
            this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setSeat(Person person, char seat) {
        if (seat == 'A')
            seatA = person;
        else if (seat == 'B')
            seatB = person;
        else
            System.err.println("Error seat choice!");
    }

    public boolean isFree() {
        return seatA == null && seatB == null;
    }

    public Person getSeat(char seat) {
        return seat == 'A' ? seatA : seatB;

    }

    void printInfo() {
        System.out.print("A) ");
        if (seatA == null)
            System.out.println("Free seat");
        else
            seatA.printInfo();
        System.out.print("B) ");
        if (seatB == null)
            System.out.println("Free seat");
        else
            seatB.printInfo();
        System.out.println();
    }


}
