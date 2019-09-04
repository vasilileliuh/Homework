package com.company;

class Unicorn {

    public static final String TYPE_OF_ANIMAL = "Mythical";

    private String name;
    private String color;
    private int ageInYears;


    //initializer block executes first
    //executes in order of being written
    {
        System.out.println("An unicorn of name " + name + " is being born");
    }

    //Constructor overloading
    public Unicorn() {
        this("Unknown", "Unknown", 0);
        System.out.println("Unicorn.Unicorn()");
    }

    {
        System.out.println("Is getting ready");
    }

    //does not have a return type
    public Unicorn(String name) {
        this(name, "Pink", 1001); //this should always be first in code
        //this(name, "Pink", 1001); - multiple calls are not allowed
        System.out.println("Unicorn.Unicorn(name)");
    }

    public Unicorn(String name, String color, int ageInYears) {
        this.name = name;
        this.color = color;
        this.ageInYears = ageInYears;
        System.out.println("Unicorn.Unicorn(name, color, ageInYears)");
    }

    //getter 0 method parameters 1 return
    //accessor-modifier | non-accessor modifier | return type | method name | (method parameters)
    public String getName() {
        //return statement
        return name;
    }

    //setter 1 method parameters 0 return
    //accessor-modifier | non-accessor modifier | return type | method name | (method parameters)
    public void setName(String name) {
        this.name = name; //this allows you to refer to the current instance
        if (name.equals("lala"))
            return;
        this.name += "_bla";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public void fly() {
        System.out.println(name + " flying...");
    }

    public void run() {
        System.out.println(name + " running... leaving rainbow");
    }

    public void executeSuperpower(String superpower) {
        System.out.println(name + " executing < " + superpower + " >");
    }

    //OVERLOADING
    public void executeSuperpower(String superpower, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            executeSuperpower(superpower);
        }
    }

    public void singVerses(String... verses) {
        System.out.println("Singing: ");
        for (int i = 0; i < verses.length; i++) {
            System.out.print(verses[i] + " ");
        }
        System.out.println();
    }

    //OVERRIDING
    @Override
    public String toString() {
        return "Unicorn{name = " +
                this.name + ", color = " +
                this.color + ", ageInYears = " +
                this.ageInYears + "}";

    }


}









