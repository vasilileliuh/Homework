package main;

public class Application {
    public static void main(String[] args) {
        Currency todaysCurrency = new Currency("EUR","MDL",17.50f,"2020-01-01");
        Currency tomorrowsCurrency = todaysCurrency.setDate("2020-01-02");
        Currency anotherCurrency = todaysCurrency.setBaseCode("USD");

        System.out.println(todaysCurrency);
        System.out.println(tomorrowsCurrency);
        System.out.println(anotherCurrency);
    }
}
