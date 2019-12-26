public class WeatherApplication {
    static int n = 1;

    public static void main(String[] args) {

        printWeather();

    }

    public static void printWeather() {
        WeatherProvider moon = new WeatherProvider();
        System.out.printf("%s%n%n" +
                        "TODAY: %.1f ℃%n%n" +
                        "%s%n%n" +
                        "%s%n", "############# WEATHER #############",
                moon.getTemperatureForToday(),
                "-----------------------------------",
                "FORECAST FOR 10 DAYS");
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("DAY %2d: %6.1f ℃%n", i + 1, moon.getTemperaturesForecastFor10Days().get(i));
//        }
        moon.getTemperaturesForecastFor10Days().forEach(WeatherApplication::printWeather10DaysForecast); // IoC
        System.out.printf("%nMAX: %9.1f ℃%n" +
                        "AVG: %9.1f ℃%n" +
                        "MIN: %9.1f ℃%n%n" +
                        "%s%n", moon.getMaxTemperatureFor10Days(),
                moon.calculateAvgFor10Days(),
                moon.getMinTemperatureFor10Days(),
                "###################################");
    }

    static void printWeather10DaysForecast(Object o) {
        System.out.printf("DAY %2d: %6.1f ℃%n", n++, o);
    }
}
