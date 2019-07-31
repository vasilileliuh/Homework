import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your height in feet: ");
        int feet = in.nextInt();
        System.out.print("Input your rest height in inches: ");
        int inches = in.nextInt();
        System.out.print("Input your weight in pounds: ");
        int pounds = in.nextInt();

        int heightininches = feet * 12 + inches;
        double heightinmeters = heightininches * 0.0254;
        double weightinkilograms = pounds / 2.20462;
        double BMI = weightinkilograms / (heightinmeters * heightinmeters);

        System.out.printf("Your height is: %d inches \n", heightininches);
        System.out.printf("Your height is: %.2f meters, weight is %.2f kilograms \n", heightinmeters, weightinkilograms);
        System.out.printf("Your BMI is: %.2f \n", BMI);

    }

}



