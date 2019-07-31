import java.util.Scanner;

public class Main {

    public static final int MINUTES_COEFFICIENT = 60;
    public static final int SECONDS_COEFFICIENT = 3600;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a latitude in degrees, minutes and seconds");
        System.out.print("Input your latitude in degrees: ");
        double degrees = in.nextInt();
        System.out.print("Input your latitude in minutes: ");
        double minutes = in.nextInt();
        System.out.print("Input your latitude in seconds: ");
        double seconds = in.nextInt();

        double decemaldegrees = degrees + (minutes / MINUTES_COEFFICIENT) + (seconds / SECONDS_COEFFICIENT);

        System.out.printf("%.0f degrees, %.0f minutes, %.0f seconds = %.4f degrees \n", degrees, minutes, seconds, decemaldegrees);


    }
}

