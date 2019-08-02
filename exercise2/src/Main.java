import java.util.Scanner;

public class Main {

    public static final double PI = 3.141592;
   // public static final double KILOMETRES_PER_MILE = 1.609;


    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the sphere in meters: ");
        double sphereRadius = in.nextDouble();

        double sphereVolume = (4.0f/3.0f) * PI * sphereRadius * sphereRadius * sphereRadius;

        System.out.printf("Your volume of a sphere is %.2f \n", sphereVolume);


    }
}