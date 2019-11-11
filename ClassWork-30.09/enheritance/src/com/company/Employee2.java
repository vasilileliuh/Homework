package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Employee2 {
    private String name;
    private String employeeNumber;
    private LocalDate hireDate;

    public Employee2(String name) {
        this.name = name;
        this.employeeNumber += new StringBuilder().append(new Random().nextInt(9))
                .append(new Random().nextInt(9))
                .append(new Random().nextInt(9))
                .append("-")
                .append((char) new Random().nextInt(12) + 65)
                .toString();


        this.hireDate = LocalDate.now();
    }

    public Employee2(String name, String employeeNumber) {
        this.name = name;
        this.employeeNumber = "";
    }

    public Employee2(String name, String employeeNumber, LocalDate hireDate) {
        this.name = name;
        this.employeeNumber = "";
        this.hireDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
