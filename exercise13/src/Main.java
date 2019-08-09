import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the letter of package (A, B or C) and the number of used hours: ");
        String packageABC = in.nextLine().toLowerCase();
        int hours = in.nextInt();

        char letter = packageABC.charAt(0);

        switch (letter) {
            case 'a':
                int extraHours = hours - 10;
                double monthPayment = 9.95 + extraHours * 2;
                System.out.printf("Your total payment is %.2f dollars \n", monthPayment);
                break;
            case 'b':
                int extraHoursB = hours - 20;
                double monthPaymentB = 13.95 + extraHoursB;
                System.out.printf("Your total payment is %.2f dollars \n", monthPaymentB);
                break;
            case 'c':
                double monthPaymentC = 19.95;
                System.out.printf("Your total payment is %.2f dollars \n", monthPaymentC);
                break;
            default: System.out.print("Wrong entered package or number of used hours \n");
        }

    }
}

