import java.util.ArrayList;
import java.util.Random;

public class ArrayListExampleTwo {

    private final static int SIZE = 31;
    private final static int MIN_TEMPERATURE = -25;
    private final static int FULL_TEMPERATURE_RANGE = 50;
    private final static double TEN = 10.0;

    public static void main(String[] args) {

        ArrayList<Double> temps = new ArrayList<>();

        Random random = new Random();
        while (temps.size() < SIZE) {
            temps.add((Math.round((MIN_TEMPERATURE + FULL_TEMPERATURE_RANGE * random.nextDouble()) * TEN) / TEN));
        }

        System.out.printf("%8s%7s%7s%7s%7s%7s%7s%n%s", "mo", "tu", "we", "th", "fi", "sa", "su", "1.");
        int j = 0, i = 2;
        for (double temperature : temps) {
            System.out.printf("%7.1f", temperature);
            j++;
            if (j % 7 == 0) {
                System.out.print("\n" + i++ + ".");
            }
        }

        Double max, min, avg, sum = 0.0;
        max = temps.get(0);
        min = max;
        for (double temperature : temps) {
            if (temperature > max)
                max = temperature;
            if (temperature < min)
                min = temperature;
            sum += temperature;
        }
        avg = sum / temps.size();
        System.out.printf("%n%n%-23s%5.1f%n%-23s%5.1f%n%-23s%5.1f%n",
                "Max temperature is", max,
                "Min temperature is", min,
                "Average temperature is", avg);
    }
}
