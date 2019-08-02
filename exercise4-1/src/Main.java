import java.util.Scanner;

public class Main {


    public static final double TAX_5_PERCENT = 1.05;


    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a dollar and cents amount: ");
        double dollarAmount = in.nextDouble();

        double summWithTax = dollarAmount * TAX_5_PERCENT;

        System.out.printf("With text added %.2f \n", summWithTax);


    }
}