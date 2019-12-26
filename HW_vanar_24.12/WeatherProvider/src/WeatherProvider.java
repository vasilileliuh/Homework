import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WeatherProvider<T extends Number> {
    private T temperatureForToday = generateTemperature();
    private List<T> temperaturesFor10Days = generateTemperaturesForecastFor10Days();
//    private static double[] temperaturesFor10Days = generateTemperaturesForecastFor10Days();

    private T generateTemperature() {
        Random rd = new Random();
        T temperature = (T) Float.valueOf(-200 + (400) * rd.nextFloat());
//        T temperature = (T) Integer.valueOf(rd.nextInt((304) + 1) + -152);
        return round(temperature);
    }

    private T round(T valueToRound) {
        float multiplicationFactor = (float) Math.pow(10, 1);
        float interestedInZeroDPs;
        if (valueToRound instanceof Float)
            interestedInZeroDPs = valueToRound.floatValue() * multiplicationFactor;
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

    T getTemperatureForToday() throws TemperatureDataOutOfRangeException {
        if (isTemperatureWithoutRange(temperatureForToday))
            throw new TemperatureDataOutOfRangeException();
        else
            return temperatureCorrector(temperatureForToday);
    }

    List<T> getTemperaturesForecastFor10Days() throws TemperatureDataOutOfRangeException {

        List<T> correctedTemperatureList = new ArrayList<>();
        for (T temperatureFor10Day : temperaturesFor10Days) {
            if (isTemperatureWithoutRange(temperatureFor10Day))
                throw new TemperatureDataOutOfRangeException();
            else
                correctedTemperatureList.add(temperatureCorrector(temperatureFor10Day));
        }
        return correctedTemperatureList;
    }

    T calculateAvgFor10Days() throws TemperatureDataOutOfRangeException {
        float sum = 0f;
        for (T temperature : temperaturesFor10Days) {
            if (isTemperatureWithoutRange(temperature))
                throw new TemperatureDataOutOfRangeException();
            else
                sum += (Float) temperatureCorrector(temperature);
        }
        return (T) Float.valueOf(sum / temperaturesFor10Days.size());
    }

    T getMaxTemperatureFor10Days() throws TemperatureDataOutOfRangeException {

        float max = (Float) temperaturesFor10Days.get(0);
        for (int i = 0; i < temperaturesFor10Days.size(); i++) {
            if (isTemperatureWithoutRange(temperaturesFor10Days.get(i)))
                throw new TemperatureDataOutOfRangeException();
            else if (max < (Float) temperaturesFor10Days.get(i))
                max = (Float) temperaturesFor10Days.get(i);
        }
        return temperatureCorrector((T) Float.valueOf(max));
    }

    T getMinTemperatureFor10Days() throws TemperatureDataOutOfRangeException {
        float min = (Float) temperaturesFor10Days.get(0);
        for (T temperature : temperaturesFor10Days) {
            if (isTemperatureWithoutRange(temperature))
                throw new TemperatureDataOutOfRangeException();
            else if (min > (Float) temperature)
                min = (Float) temperature;
        }
        return temperatureCorrector((T) Float.valueOf(min));
    }

    private boolean isTemperatureWithinNegativeOffsetRange(T valueToCheck) {
        return (Float) valueToCheck >= -152 && (Float) valueToCheck < -150;
    }

    private boolean isTemperatureWithinPositiveOffsetRange(T valueToCheck) {
        return (Float) valueToCheck > 150 && (Float) valueToCheck <= 152;
    }

    private boolean isTemperatureWithoutRange(T valueToCheck) {
        return (Float) valueToCheck < -152 || (Float) valueToCheck > 152;
    }

    private T temperatureCorrector(T valueToCorrect) {
        if (isTemperatureWithinNegativeOffsetRange(valueToCorrect))
            return (T) Float.valueOf(-150f);
        else if (isTemperatureWithinPositiveOffsetRange(valueToCorrect))
            return (T) Float.valueOf(150f);
        else
            return valueToCorrect;
    }
}
