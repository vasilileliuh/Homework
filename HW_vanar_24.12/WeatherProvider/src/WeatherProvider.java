import java.util.Random;

class WeatherProvider {
    private static double temperatureForToday = generateTemperature();
    private static double[] temperaturesFor10Days = generateTemperaturesForecastFor10Days();

    private static double generateTemperature() {
        Random rd = new Random();
        double temperature = -150 + (300) * rd.nextDouble();
        return round(temperature);
    }

    private static double round(double valueToRound) {
        double multiplicationFactor = Math.pow(10, 1);
        double interestedInZeroDPs = valueToRound * multiplicationFactor;
        return Math.round(interestedInZeroDPs) / multiplicationFactor;
    }

    private static double[] generateTemperaturesForecastFor10Days() {
        double[] forecast = new double[10];
        for (int i = 0; i < 10; i++) {
            forecast[i] = generateTemperature();
        }
        return forecast;
    }

    static double getTemperatureForToday() {
        return temperatureForToday;
    }

    static double[] getTemperaturesForecastFor10Days() {
        return temperaturesFor10Days;
    }

    static double calculateAvgFor10Days() {
        double sum = 0;
        for (double temperature : temperaturesFor10Days) {
            sum += temperature;
        }
        return sum / temperaturesFor10Days.length;
    }

    static double getMaxTemperatureFor10Days() {
        double max = temperaturesFor10Days[0];
        for (int i = 1; i < temperaturesFor10Days.length; i++) {
            if (max < temperaturesFor10Days[i])
                max = temperaturesFor10Days[i];
        }
        return max;
    }

    static double getMinTemperatureFor10Days() {
        double min = temperaturesFor10Days[0];
        for (int i = 1; i < temperaturesFor10Days.length; i++) {
            if (min > temperaturesFor10Days[i])
                min = temperaturesFor10Days[i];
        }
        return min;
    }
}
