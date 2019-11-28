package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class WeatherTemperatureApp {

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter a valid code\n(one of these countries: Mexico: 484; Micronesia: 583; Moldova: 498; Monaco: 492; Mongolia: 496)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countryCode = Integer.parseInt(reader.readLine());

        System.out.print("Temperature: ");
        System.out.printf("%s%n", isCountryCodeValid(countryCode) ? PrivateWeatherForecastProvider.getCurrentTemperature() : "Can't provide data for this country!");
        System.out.print("Humidity: ");
        System.out.printf("%s%n", isCountryCodeValid(countryCode) ? PrivateWeatherForecastProvider.getCurrentHumidity() : "Can't provide data for this country!");

    }

    private static boolean isCountryCodeValid(int countryCode) {
        return countryCode == 484 || countryCode == 583 ||
                countryCode == 498 || countryCode == 492 || countryCode == 496;

    }
}

class OpenWeatherForecastProvider {

    static double getCurrentTemperature() {
        Random r = new Random();
        return Math.round(-50.0 + (100) * r.nextDouble());
    }
}

class PrivateWeatherForecastProvider extends OpenWeatherForecastProvider {

    static byte getCurrentHumidity() {

        Random r = new Random();
        return (byte) r.nextInt(101);

    }
}