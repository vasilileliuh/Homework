package com.company;

public class Table {

    public final static String GENUS = "Furniture";

    private String designation = "unknown";
    private int modelYear;
    private String color;
    private int numberOfLegs;

    {
        System.out.println(designation + " table is being bought!");
    }

    public Table() {
        this("Retro", 1220, "Yellow", 1);
    }

    public Table(String designation, int modelYear) {
        this(designation, modelYear, "Dark Ouk", 4);
    }

    public Table(String designation, int modelYear, String color, int numberOfLegs) {
        this.designation = designation;
        this.modelYear = modelYear;
        this.color = color;
        this.numberOfLegs = numberOfLegs;

    }

    public void creak() {
        System.out.println(designation + " > Piu Piu!");
    }


    public void restavration(String substance) {
        System.out.println(designation + " been repaired with " + substance);
    }

    public void restavration(String substance, int timesPerYear) {
        for (int i = 1; i <= timesPerYear; i++) {
            System.out.println(designation + " > receiving " + substance + " #" + i);
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnumberOfLegs() {
        return numberOfLegs;
    }

    public void getnumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Table{" +
                "Designation = '" + designation + '\'' +
                ", Model year = '" + modelYear + '\'' +
                ", Color = '" + color + '\'' +
                ", has Number of legs = '" + numberOfLegs + '\'' + "}";

    }


}
