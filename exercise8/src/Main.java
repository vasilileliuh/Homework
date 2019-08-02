import java.util.Scanner;

public class Main {

    public static final int MONTHS_IN_THE_YEAR = 12;

    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of loan: ");
        float loan = in.nextFloat();
        System.out.print("Enter annual interest rate: ");
        float rate = in.nextFloat();
        System.out.print("Enter monthly payment: ");
        float payment = in.nextFloat();


        float monthlyInterestRate = rate / 100 / MONTHS_IN_THE_YEAR;

        float firstBalance = loan * (1 + monthlyInterestRate) - payment;

        float secondLoan = firstBalance * (1 + monthlyInterestRate);
        float secondBalance = secondLoan - payment;

        float thirdLoan = secondBalance * (1 + monthlyInterestRate);
        float thirdBalance = thirdLoan - payment;

        System.out.printf("Balance remaining after first payment: %.2f \n", firstBalance);
        System.out.printf("Balance remaining after second payment: %.2f \n", secondBalance);
        System.out.printf("Balance remaining after third payment: %.2f \n", thirdBalance);

    }
}

