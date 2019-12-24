public class WeatherApplication {
    public static void main(String[] args) {

        printWeather();

    }

    public static void printWeather() {
        System.out.printf("%s%n%n" +
                        "TODAY: %.1f ℃%n%n" +
                        "%s%n%n" +
                        "%s%n", "############# WEATHER #############",
                WeatherProvider.getTemperatureForToday(),
                "-----------------------------------",
                "FORECAST FOR 10 DAYS");
        for (int i = 0; i < 10; i++) {
            System.out.printf("DAY %2d: %6.1f ℃%n", i + 1, WeatherProvider.getTemperaturesForecastFor10Days()[i]);
        }
        System.out.printf("%nMAX: %9.1f ℃%n" +
                        "AVG: %9.1f ℃%n" +
                        "MIN: %9.1f ℃%n%n" +
                        "%s%n", WeatherProvider.getMaxTemperatureFor10Days(),
                WeatherProvider.calculateAvgFor10Days(),
                WeatherProvider.getMinTemperatureFor10Days(),
                "###################################");
    }
}
