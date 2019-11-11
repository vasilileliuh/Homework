package com.company;

import java.time.LocalDate;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;


    Account() {
        this(0, 0.0);
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = LocalDate.now();
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    LocalDate getDateCreated() {
        return dateCreated;
    }

    private double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    void withdraw(double sumToWithdraw) {
        balance = balance - sumToWithdraw;
    }

    void deposit(double sumToDeposit) {
        balance = balance + sumToDeposit;
    }


    public String toString() {
        return "ID = " + id + " Balance = "
                + balance + " Annual interest rate = "
                + annualInterestRate + " Date created = "
                + dateCreated;
    }

}
