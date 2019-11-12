package com.company;

class Exercise2 {

    private static final float KILOMETERS_IN_MILE = 1.6f;
    private static final byte MINUTES_IN_HOUR = 60;

    private int distanceBetweenCitiesMiles, speedOfCarInKmH;

    Exercise2(int distanceBetweenCitiesMiles, int speedOfCarInKmH) {
        this.distanceBetweenCitiesMiles = distanceBetweenCitiesMiles;
        this.speedOfCarInKmH = speedOfCarInKmH;
    }

    static int neededTimeInHours(Exercise2 car) {
        return car.distanceBetweenCitiesMiles / (int) (car.speedOfCarInKmH / KILOMETERS_IN_MILE);
    }

    static int neededExtraTimeInMinutes(Exercise2 car) {
        double neededTimeInMinutes = car.distanceBetweenCitiesMiles / ((double) car.speedOfCarInKmH / KILOMETERS_IN_MILE / MINUTES_IN_HOUR);
        return (int) Math.round(neededTimeInMinutes % MINUTES_IN_HOUR);
    }
}
