package main;

import restaurant.Restaurant;
import restaurant.Table;
import world.Person;

public class Application {
    public static void main(String[] args) {

        Person ion = new Person("John Doe", 'm', 31, "Designer");
        Person jane = new Person("Jane Doe", 'f', 30, null);
        Person bob = new Person("Bob Marley", 'm', 35, "Singer");
        Person liza = new Person("Liza Minnelly", 'f', 73, null);
        Person thomas = new Person("Thomas Kilk", 'm', 30, "Waiter");

//        ion.setJobTitle("Designer");
//        bob.setJobTitle("Singer");
//        thomas.setJobTitle("Waiter");


        Table aaa = new Table(1);
        Table bbb = new Table(2);
        Table ccc = new Table(3);

        Restaurant goodMorning = new Restaurant("Good Morning Sunshine!");
        goodMorning.setWaiter(thomas);

        goodMorning.setTable(aaa, aaa.number);
        goodMorning.getTable(aaa.number).setSeat(ion, 'A');
        goodMorning.getTable(aaa.number).setSeat(jane, 'B');

        goodMorning.setTable(bbb, bbb.number);
        goodMorning.getTable(bbb.number).setSeat(bob, 'B');

        goodMorning.setTable(ccc, ccc.number);
        goodMorning.getTable(ccc.number).setSeat(liza, 'A');

        goodMorning.printInfo();

    }
}
