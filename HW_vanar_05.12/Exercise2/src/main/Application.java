package main;

import restaurant.Restaurant;
import restaurant.Table;
import world.Person;

public class Application {
    public static void main(String[] args) {

        Person ion = new Person("John Doe", 'm', 31, "Designer");
        Person jane = new Person("Jane Doe", 'f', 30);
        Person bob = new Person("Bob Marley", 'm', 35, "Singer");
        Person liza = new Person("Liza Minnelly", 'f', 73);
        Person thomas = new Person("Thomas Kilk", 'm', 30, "Waiter");

//        ion.setJobTitle("Designer");
//        bob.setJobTitle("Singer");
//        thomas.setJobTitle("Waiter");


        Table aaa = new Table(1);
        Table bbb = new Table(2);
        Table ccc = new Table(3);

        Restaurant goodMorning = new Restaurant("Good Morning Sunshine!");
        goodMorning.setWaiter(thomas);

        goodMorning.setTable(aaa, aaa.getNumber());
        goodMorning.getTable(aaa.getNumber()).setSeat(ion, 'A');
        goodMorning.getTable(aaa.getNumber()).setSeat(jane, 'B');

        goodMorning.setTable(bbb, bbb.getNumber());
        goodMorning.getTable(bbb.getNumber()).setSeat(bob, 'B');

        goodMorning.setTable(ccc, ccc.getNumber());
        goodMorning.getTable(ccc.getNumber()).setSeat(liza, 'A');

        goodMorning.printInfo();

    }
}
