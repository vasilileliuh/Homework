package com.company;

public class Plane {

    public final static String GENUS = "Airplane";

    private String model;
    private int maxCapacity;
    private String color;
    private int yearOfIssue;
    private boolean isCombat;

    {
        System.out.println(model + " plane is being bought!");
    }

    public Plane() {
        this("Airbus", 890, "Blue", 2008, false);
    }

    public Plane(String model, int maxCapacity) {
        this(model, maxCapacity, "Military", 2010, true);
    }

    public Plane(String model, int maxCapacity, String color, int yearOfIssue, boolean isCombat) {
        this.model = model;
        this.maxCapacity = maxCapacity;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.isCombat = isCombat;
    }

    public void warningSound() {
        System.out.println(model + " Whau, Whau!");
    }

    public void engineSound() {
        System.out.println(model + " Brou, Vraa!");
    }

    public void makingFlight(String flight) {
        System.out.println(model + " is running " + flight);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
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

    public boolean getIsNew(boolean isCombat){
        return isCombat;
    }

    public void setIsNew(boolean isCombat){
        this.isCombat = isCombat;
    }
    @Override
    public String toString(){
        return "Plane model = " + model
                + ", Max Capacity = " + maxCapacity
                + ", Color = " + color
                + ", Year of issue " + yearOfIssue
                + ", Is combat " + isCombat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Plane) {
            Plane that = (Plane) obj;
            return this.model.equals(that.model)
                    && this.maxCapacity == that.maxCapacity
                    && this.color.equals(that.color)
                    && this.yearOfIssue == that.yearOfIssue
                    && this.isCombat == that.isCombat;
        }
        else {
            return false;
        }
    }


}


