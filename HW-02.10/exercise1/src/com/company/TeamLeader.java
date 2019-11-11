package com.company;

import java.time.LocalDate;

class TeamLeader extends ProductionWorker {
    int monthlyBonusAmount;
    int requiredNumberOfTrainingHours;
    int attendedNumberOfTrainingHours;

    TeamLeader(String name, LocalDate hireDate, int shift, double hourlyPayRate, int monthlyBonusAmount, int requiredNumberOfTrainingHours, int attendedNumberOfTrainingHours){
        super(name, hireDate, shift, hourlyPayRate);
        setMonthlyBonusAmount(monthlyBonusAmount);
        setRequiredNumberOfTrainingHours(requiredNumberOfTrainingHours);
        setAttendedNumberOfTrainingHours(attendedNumberOfTrainingHours);
    }

    public int getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(int monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public int getRequiredNumberOfTrainingHours() {
        return requiredNumberOfTrainingHours;
    }

    public void setRequiredNumberOfTrainingHours(int requiredNumberOfTrainingHours) {
        this.requiredNumberOfTrainingHours = requiredNumberOfTrainingHours;
    }

    public int getAttendedNumberOfTrainingHours() {
        return attendedNumberOfTrainingHours;
    }

    public void setAttendedNumberOfTrainingHours(int attendedNumberOfTrainingHours) {
        this.attendedNumberOfTrainingHours = attendedNumberOfTrainingHours;
    }

    public String toString() {
        return "TeamLeader{" +
                "name = '" + name + '\'' +
                ", employeeNumber = '" + employeeNumber + '\'' +
                ", hireDate = " + hireDate +
                ", shift = " + shift +
                "' hourlyPayRate = " + hourlyPayRate +
                ", monthlyBonusAmount = " + monthlyBonusAmount +
                ", requiredNumberOfTrainingHours = " + requiredNumberOfTrainingHours +
                "' attendedNumberOfTrainingHours = " + attendedNumberOfTrainingHours +
                '}';
    }

}
