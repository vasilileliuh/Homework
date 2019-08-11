import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter month number(1-12): ");
        int monthNumber = in.nextInt();

        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Total number of days = 31");
                break;
            case 2:
                System.out.println("Total number of days in February = 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Total number of days in April = 30");
                break;
            default:
                System.out.println("Please enter correct month number");
        }
    }
}