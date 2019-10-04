package com.company;

import java.time.LocalDate;

public class ProductionWorker extends Employee {
    int shift = 0;
    double hourlyPayRate;

    ProductionWorker(String name, LocalDate hireDate, int shift, double hourlyPayRate) {
        super(name, hireDate);
        setShift(shift);
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    void setShift(int shift) {
        if (shift > 2 || shift < 1)
            this.shift = 1;
        else
            this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "ProductionWorker{" +
                "shift = '" + shift +
                "', hourlyPayRate = '" + hourlyPayRate +
                "', name = '" + name + '\'' +
                ", employeeNumber = '" + employeeNumber + '\'' +
                ", hireDate = " + hireDate +
                '}';
    }
}

