import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WeatherProvider<T extends Number> {
    private T temperatureForToday = generateTemperature();
    private List<T> temperaturesFor10Days = generateTemperaturesForecastFor10Days();
//    private static double[] temperaturesFor10Days = generateTemperaturesForecastFor10Days();

    private T generateTemperature() {
        Random rd = new Random();
//        T temperature = (T) Float.valueOf(-150 + (300) * rd.nextFloat());
        T temperature = (T) Integer.valueOf(rd.nextInt((300) + 1) + -150);
        return round(temperature);
    }

    private T round(T valueToRound) {
        byte multiplicationFactor = (byte) Math.pow(10, 1);
        float interestedInZeroDPs;
        if (valueToRound instanceof Float)
            interestedInZeroDPs = (Float) valueToRound * multiplicationFactor;
        else
            interestedInZeroDPs = (float) valueToRound.intValue() * multiplicationFactor;

        return (T) Float.valueOf(Math.round(interestedInZeroDPs) / multiplicationFactor);
    }

    private List<T> generateTemperaturesForecastFor10Days() {
        List<T> temperatureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            temperatureList.add(generateTemperature());
        }
        return temperatureList;
    }

    T getTemperatureForToday() {
        return temperatureForToday;
    }

    List<T> getTemperaturesForecastFor10Days() {
        return temperaturesFor10Days;
    }

    T calculateAvgFor10Days() {
        float sum = 0f;
        for (T temperature : temperaturesFor10Days) {
            sum += (Float) temperature;
        }
        return (T) Float.valueOf(sum / temperaturesFor10Days.size());
    }

    T getMaxTemperatureFor10Days() {
        float max = (Float) temperaturesFor10Days.get(0);
        for (int i = 1; i < temperaturesFor10Days.size(); i++) {
            if (max < (Float) temperaturesFor10Days.get(i))
                max = (Float) temperaturesFor10Days.get(i);
        }
        return (T) Float.valueOf(max);
    }

    T getMinTemperatureFor10Days() {
        float min = (Float) temperaturesFor10Days.get(0);
        for (T temperature : temperaturesFor10Days) {
            if (min > (Float) temperature)
                min = (Float) temperature;
        }
        return (T) Float.valueOf(min);
    }
}
