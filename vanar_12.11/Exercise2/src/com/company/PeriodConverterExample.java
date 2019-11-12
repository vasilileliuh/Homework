package com.company;

public class PeriodConverterExample {

    public static void main(String[] args) {

        final int YEAR_DAYS = 365;
        final int MONTH_DAYS = 30;
        final int WEEK_DAYS = 7;

        int periodDays = 1234;
        int toYears, toMonths, toWeeks, leftPeriodOFDaysAfterToYears,
                leftPeriodOFDaysAfterToMonths, leftPeriodOFDaysAfterToWeeks;

        toYears = periodDays / YEAR_DAYS;
        leftPeriodOFDaysAfterToYears = periodDays % YEAR_DAYS;
        toMonths = leftPeriodOFDaysAfterToYears / MONTH_DAYS;
        leftPeriodOFDaysAfterToMonths = leftPeriodOFDaysAfterToYears % MONTH_DAYS;
        toWeeks = leftPeriodOFDaysAfterToMonths / WEEK_DAYS;
        leftPeriodOFDaysAfterToWeeks = leftPeriodOFDaysAfterToMonths % WEEK_DAYS;

        System.out.println(periodDays + " days = " + toYears + " years, " + toMonths + " months, " +
                toWeeks + " weeks, " + leftPeriodOFDaysAfterToWeeks + " days");
    }

}
