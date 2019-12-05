package main;

import restaurant.Restaurant;
import restaurant.Table;
import world.Person;

public class Application {
    public static void main(String[] args) {

        Person ion = new Person("John Doe", 'm', 31);
        Person jane = new Person("Jane Doe", 'f', 30);
        Person bob = new Person("Bob Marley", 'm', 35);
        Person liza = new Person("Liza Minnelly", 'f', 73);

        Table one = new Table(1);
        Table two = new Table(2);
        Table three = new Table(3);

        one.setSeat(ion, 'A');
        one.setSeat(jane, 'B');
        two.setSeat(bob, 'B');
        three.setSeat(liza, 'A');

        Restaurant goodMorning = new Restaurant("Good Morning Sunshine!");
        goodMorning.setTable(one, 1);
        goodMorning.setTable(two, 2);
        goodMorning.setTable(three, 3);

        goodMorning.printInfo();

    }
}
