import java.util.Scanner;

public class Main {

   /* public static final int SECONDS_IN_MINUTE = 60;
    * public static final int MINUTES_IN_HOUR = 60;
    * public static final int HOURS_IN_DAY = 24;
    */

    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the world's population: ");
        double worldPopulation = in.nextLong();
        System.out.print("Enter the population of the US: ");
        double usPopulation = in.nextLong();

        double percentOfUsPopulation = usPopulation * 100 / worldPopulation ;

        System.out.printf("The population of the US is %f%% of the world population \n", percentOfUsPopulation);


    }
}

