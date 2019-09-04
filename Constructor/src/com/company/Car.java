package com.company;

public class Car {

    public final static String GENUS = "Vehicle";

    private String model;
    private int maxSpeed;
    private String color;
    private int yearOfIssue;
    private boolean isNew;

    {
        System.out.println(model + " car is being bought!");
    }

    public Car() {
        this("Mercedes", 250, "Red", 2010, true);
    }

    public Car(String model, int maxSpeed) {
        this(model, maxSpeed, "Red", 2010, true);
    }

    public Car(String model, int maxSpeed, String color, int yearOfIssue, boolean isNew) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.isNew = isNew;
    }

    public void alarmSound() {
        System.out.println(model + " Beep, Beep!");
    }

    public void engineSound() {
        System.out.println(model + " Vroom, Vroom!");
    }

    public void runningRace(String grandPrix) {
        System.out.println(model + " is running " + grandPrix);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfIssue(int yearOfIssue) {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public boolean getIsNew(boolean isNew){
        return isNew;
    }

    public void setIsNew(boolean isNew){
        this.isNew = isNew;
    }
@Override
    public String toString(){
        return "Car model = " + model
                + ", Max Speed = " + maxSpeed
                + ", Color = " + color
                + ", Year of issue " + yearOfIssue
                + ", Is new " + isNew;
    }



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
        bmw.runningRace("Belgium GrandPrix");
        renault.alarmSound();
        renault.engineSound();
        renault.runningRace("Belgium GrandPrix");


    }
}