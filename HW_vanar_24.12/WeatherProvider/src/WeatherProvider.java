import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WeatherProvider {
    private static Number temperatureForToday = generateTemperature();
    private static List<Number> temperaturesFor10Days = generateTemperaturesForecastFor10Days();
//    private static double[] temperaturesFor10Days = generateTemperaturesForecastFor10Days();

    private static Number generateTemperature() {
        Random rd = new Random();
        Number temperature = -150 + (300) * rd.nextFloat();
        return round(temperature);
    }

    private static Number round(Number valueToRound) {
        float multiplicationFactor = (float) Math.pow(10, 1);
        float interestedInZeroDPs = (float) valueToRound * multiplicationFactor;
        return Math.round(interestedInZeroDPs) / multiplicationFactor;
    }

    private static List<Number> generateTemperaturesForecastFor10Days() {
        List<Number> temperatureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            temperatureList.add(generateTemperature());
        }
        return temperatureList;
    }

    static Number getTemperatureForToday() {
        return temperatureForToday;
    }

    static List<Number> getTemperaturesForecastFor10Days() {
        return temperaturesFor10Days;
    }

    static Number calculateAvgFor10Days() {
        float sum = 0.0f;
        for (Number temperature : temperaturesFor10Days) {
            sum += (float) temperature;
        }
        return sum / temperaturesFor10Days.size();
    }

    static Number getMaxTemperatureFor10Days() {
        float max = (float) temperaturesFor10Days.get(0);
        for (int i = 1; i < temperaturesFor10Days.size(); i++) {
            if (max < (float) temperaturesFor10Days.get(i))
                max = (float) temperaturesFor10Days.get(i);
        }
        return max;
    }

    static Number getMinTemperatureFor10Days() {
        float min = (float) temperaturesFor10Days.get(0);
        for (Number temperature : temperaturesFor10Days) {
            if (min > (float) temperature)
                min = (float) temperature;
        }
        return min;
    }
}
