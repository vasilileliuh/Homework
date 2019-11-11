package com.company;

public class Month {

    private int monthNumber;

    Month() {
        setMonthNumber(1);
    }

    Month(int monthNumber) {
        setMonthNumber(monthNumber);

    }

    Month(String nameOfTheMonth) {
        switch (nameOfTheMonth.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 1;
        }
    }

    void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        } else
            this.monthNumber = monthNumber;
    }

    int getMonthNumber() {
        return monthNumber;
    }

    String getMonthName() {
        String monthName = "";
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month that = (Month) obj;
            return this.monthNumber == that.monthNumber;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Month name = " + getMonthName();
    }

}
