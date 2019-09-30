package com.company;

public class Demo {
    public static void main(String[] args) {

        Car standard = new Car();
        Car bmw = new Car("BMW", 220);
        Car renault = new Car("Renault", 175, "White", 1998, false);
        System.out.println(standard);
        System.out.println(bmw);
        System.out.println(renault);
        System.out.println(Car.GENUS);
        standard.alarmSound();
        standard.engineSound();
        standard.runningRace("Belgium GrandPrix");
        bmw.alarmSound();
        bmw.engineSound();
        bmw.runningRace("German GrandPrix");
        renault.alarmSound();
        renault.engineSound();
        renault.runningRace("Belgium GrandPrix");

        Car renaultCopy = new Car("Renault", 175, "White", 1998, false);
        System.out.println(standard.equals(bmw));
        System.out.println(bmw.equals(renault));
        System.out.println(renault.equals(renaultCopy));

        System.out.println();

        Plane standard1 = new Plane();
        Plane boeing = new Plane("Lockheed AC-130", 13);
        Plane tu = new Plane("Tu-204", 175, "White", 1998, false);
        System.out.println(standard1);
        System.out.println(boeing);
        System.out.println(tu);
        System.out.println(Plane.GENUS);
        standard1.warningSound();
        standard1.engineSound();
        standard1.makingFlight("London - Paris");
        boeing.warningSound();
        boeing.engineSound();
        boeing.makingFlight("Berlin - New-York");
        tu.warningSound();
        tu.engineSound();
        tu.makingFlight("Moscow - Tokio");

        Plane tu2 = new Plane("Tu-204", 175, "White", 1998, false);
        System.out.println(standard1.equals(boeing));
        System.out.println(boeing.equals(tu));
        System.out.println(tu.equals(tu2));

        System.out.println();

        Deer a = new Deer();
        Deer bob = new Deer("Bob", 8);
        Deer albert = new Deer("Albert", 15, "Red", "Red Tree");
        System.out.println(a);
        System.out.println(bob);
        System.out.println(albert);
        System.out.println(Deer.GENUS);
        albert.findFood("Grass");
        albert.findFood("Moss", 8);
        bob.roar();
        bob.jump();

        Deer albert2 = new Deer("Albert", 15, "Red", "Red Tree");
        System.out.println(a.equals(bob));
        System.out.println(bob.equals(albert));
        System.out.println(albert.equals(albert2));

        System.out.println();

        Tree pine = new Tree();
        Tree maple = new Tree("Maple", 45);
        Tree firTree = new Tree("Fir-tree", 14, "Green", "sting");
        System.out.println(pine);
        System.out.println(maple);
        System.out.println(firTree);
        System.out.println(Tree.GENUS);
        firTree.manuring("Muck");
        firTree.manuring("Mineral", 2);
        maple.rustle();
        maple.grow();

        Tree firTree2 = new Tree("Fir-tree", 14, "Green", "sting");
        System.out.println(pine.equals(maple));
        System.out.println(maple.equals(firTree));
        System.out.println(firTree.equals(firTree2));

        System.out.println();

        Table retro = new Table();
        Table modern = new Table("Modern", 2018);
        Table classic = new Table("Classic", 1980, "Gray", 3);
        System.out.println(retro);
        System.out.println(modern);
        System.out.println(classic);
        System.out.println(Table.GENUS);
        retro.creak();
        retro.restavration("Varnish", 1);
        classic.creak();
        modern.creak();

        Table classic2 = new Table("Classic", 1980, "Gray", 3);
        System.out.println(retro.equals(modern));
        System.out.println(modern.equals(classic));
        System.out.println(classic.equals(classic2));

    }
}
