import java.util.Scanner;

public class Main {

      public static final double LITER_PER_GALON = 3.785;
      public static final double KILOMETRES_PER_MILE = 1.609;


    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter gasoline consumption in liters: ");
        double literPerKilometers = in.nextDouble();

        double milesPerGalon = (LITER_PER_GALON * 100) / (literPerKilometers * KILOMETRES_PER_MILE);

        System.out.printf("Your MPG efficiency is %.2f \n", milesPerGalon);


    }
}