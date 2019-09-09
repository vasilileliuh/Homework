package com.company;

public class Tree {

    public final static String GENUS = "Plants";

    private String designation = "unknown";
    private int ageInYears;
    private String color;
    private String leafShape;

    {
        System.out.println(designation + " tree is being planted!");
    }

    public Tree() {
        this("Palm", 25, "Green", "oblong shape");
    }

    public Tree(String name, int ageInYears) {
        this(name, ageInYears, "Dark Green", "rounded");
    }

    public Tree(String name, int ageInYears, String color, String leafShape) {
        this.designation = name;
        this.ageInYears = ageInYears;
        this.color = color;
        this.leafShape = leafShape;

    }

    public void rustle() {
        System.out.println(designation + " > Shee Shou!");
    }

    public void grow() {
        System.out.println(designation + " > Growing...");
    }

    public void manuring(String fertilizer) {
        System.out.println(designation + " receiving " + fertilizer);
    }

    public void manuring(String fertilizer, int timesPerDay) {
        for (int i = 1; i <= timesPerDay; i++) {
            System.out.println(designation + " > receiving " + fertilizer + " #" + i);
        }
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLeafShape() {
        return leafShape;
    }

    public void setLeafShape(String leafShape) {
        this.leafShape = leafShape;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "Name = '" + designation + '\'' +
                ", Age in years = '" + ageInYears + '\'' +
                ", Color = '" + color + '\'' +
                ", Leaf shape = '" + leafShape + '\'' + "}";

    }


}
