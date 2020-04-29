public class WeatherApplication {

    private static int counter = 1;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            printWeather();
        }


    }

    public static void printWeather() {
        try {
            WeatherProvider moon = new WeatherProvider();

//            moon.getTemperaturesForecastFor10Days().forEach(WeatherApplication::printWeather10DaysForecast); // IoC

            System.out.printf("%s%n%n" +
                            "TODAY: %.1f ℃%n%n" +
                            "%s%n%n" +
                            "%s%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "DAY %2d: %6.1f ℃%n" +
                            "%nMAX: %9.1f ℃%n" +
                            "AVG: %9.1f ℃%n" +
                            "MIN: %9.1f ℃%n%n" +
                            "%s%n%n",
                    "############# WEATHER #############",
                    moon.getTemperatureForToday(),
                    "-----------------------------------",
                    "FORECAST FOR 10 DAYS",
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(0)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(0),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(1)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(1),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(2)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(2),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(3)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(3),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(4)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(4),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(5)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(5),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(6)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(6),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(7)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(7),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(8)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(8),
                    moon.getTemperaturesForecastFor10Days().indexOf(moon.getTemperaturesForecastFor10Days().get(9)) + 1,
                    moon.getTemperaturesForecastFor10Days().get(9),
                    moon.getMaxTemperatureFor10Days(),
                    moon.calculateAvgFor10Days(),
                    moon.getMinTemperatureFor10Days(),
                    "###################################");
        } catch (TemperatureDataOutOfRangeException e) {
            System.out.print("############# WEATHER #############\n" +
                    "\n" +
                    "We are sorry! \n" +
                    "The data is unavailable!\n" +
                    "\n" +
                    "###################################\n\n");
        }
    }

    static void printWeather10DaysForecast(Object o) {
        System.out.printf("DAY %2d: %6.1f ℃%n", counter++, o);
    }
}

