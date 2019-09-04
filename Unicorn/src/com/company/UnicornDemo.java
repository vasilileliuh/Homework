package com.company;

public class UnicornDemo {

    public static void main(String[] args) {
        Unicorn mikey = new Unicorn("Mikey", "Pink", 999);
        Unicorn hector = new Unicorn("Hector");
        Unicorn haley = new Unicorn();
        System.out.println(mikey);
        System.out.println(hector);
        System.out.println(haley);
        System.out.println();
        System.out.println(Unicorn.TYPE_OF_ANIMAL);
        System.out.println(mikey.TYPE_OF_ANIMAL);
        System.out.println(hector.TYPE_OF_ANIMAL);
        System.out.println(haley.TYPE_OF_ANIMAL);
        System.out.println();
        mikey.fly();
        mikey.run();
        mikey.executeSuperpower("Sonic blast");
        mikey.executeSuperpower("Rainbow poop", 5);
        hector.fly();
        haley.run();
        System.out.println();
        haley.setName("Haley");
        haley.setColor("Aqua");
        haley.setAgeInYears(666);
        System.out.println(haley);
        haley.run();
        haley.singVerses();
        haley.singVerses("la");
        haley.singVerses("La", "Tra", "La");
        haley.singVerses(new String[]{"Lo", "Lea", "Lo"});
        haley.run();

    }

}
