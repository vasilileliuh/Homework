import java.util.Scanner;

public class Main {

    /* public static final int SECONDS_IN_MINUTE = 60;
     * public static final int MINUTES_IN_HOUR = 60;
     * public static final int HOURS_IN_DAY = 24;
     */

    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter distance you have driven in kilometers: ");
        float kilometers = in.nextInt();
        System.out.print("Enter amount of gasoline you have spent in litres: ");
        float litres = in.nextInt();

        float fuelEfficiency =  litres /kilometers * 100;

        System.out.printf("The fuel efficiency of your trip is %.2f litres per 100 km \n", fuelEfficiency);


    }
}

