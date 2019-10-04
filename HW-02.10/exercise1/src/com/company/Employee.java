package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    String name;
    String employeeNumber;
    LocalDate hireDate;

    public Employee(String name) {
        this(name, LocalDate.now());
    }

    public Employee(String name, LocalDate hireDate) {
        this(name, "", hireDate);
    }

    public Employee(String name, String employeeNumber, LocalDate hireDate) {
        this.name = name;
        if (!isValid(employeeNumber))
            this.employeeNumber = generateEmployeeNumber();
        else
            this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    private String generateEmployeeNumber() {
        return new StringBuilder()
                .append(new Random().nextInt(9)+1)
                .append(new Random().nextInt(9)+1)
                .append(new Random().nextInt(9)+1)
                .append("-")
                .append((char) (new Random().nextInt(12) + 65))
                .toString();
    }

    private boolean isValid(String employeeNumber) {
        return employeeNumber.length() == 5
                && Character.isDigit(employeeNumber.charAt(0))
                && Character.isDigit(employeeNumber.charAt(1))
                && Character.isDigit(employeeNumber.charAt(2))
                && employeeNumber.charAt(3) == '-'
                && employeeNumber.charAt(4) > 65
                && employeeNumber.charAt(4) < 77;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", employeeNumber = '" + employeeNumber + '\'' +
                ", hireDate = " + hireDate +
                '}';
    }
}

