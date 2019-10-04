package com.company;

import java.time.LocalDate;

public class ShiftSupervisor extends Employee {
    private int annualSalary;
    private int annualProductionBonus;

    ShiftSupervisor(String name, String employeeNumber, LocalDate hireDate, int annualSalary, int annualProductionBonus) {
        super(name, employeeNumber, hireDate);
        setAnnualSalary(annualSalary);
        setAnnualProductionBonus(annualProductionBonus);
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(int annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }

    public String toString() {
        return "ShiftSupervisor{" +
                "name = '" + name + '\'' +
                ", employeeNumber = '" + employeeNumber + '\'' +
                ", hireDate = " + hireDate +
                ", annualSalary = " + annualSalary +
                "' annualProductionBonus = " + annualProductionBonus +
                '}';
    }

}
