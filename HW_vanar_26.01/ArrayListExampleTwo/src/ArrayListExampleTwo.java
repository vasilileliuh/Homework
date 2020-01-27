import java.util.ArrayList;
import java.util.Random;

public class ArrayListExampleTwo {
    public static void main(String[] args) {

        ArrayList<Double> temps = new ArrayList<>();

        Random random = new Random();
        while (temps.size() < 31) {
            temps.add((Math.round((-25 + random.nextDouble() * 50) * 10) / 10.0));
        }

        System.out.printf("%8s%7s%7s%7s%7s%7s%7s%n%s", "mo", "tu", "we", "th", "fi", "sa", "su", "1.");
        int j = 0;
        int i = 2;
        for (double temperature : temps) {
            System.out.printf("%7.1f", temperature);
            j++;
            if (j % 7 == 0) {
                System.out.print("\n" + i + ".");
                i++;
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
