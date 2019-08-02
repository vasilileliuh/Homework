import java.util.Scanner;

public class Main {

    public static final int Bill_20_USD = 20;
    public static final int Bill_10_USD = 10;
    public static final int Bill_5_USD = 5;
    public static final int Bill_1_USD = 1;


    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a US dollars amount: ");
        int dAmount = in.nextInt();

        int twenty = dAmount / Bill_20_USD;
        int leftAmountInLess20 = dAmount - twenty * Bill_20_USD;
        int ten = leftAmountInLess20 / Bill_10_USD;
        int leftAmountInLess10 = leftAmountInLess20 - ten * Bill_10_USD;
        int five = leftAmountInLess10 / Bill_5_USD;
        int leftAmountInLess5 = leftAmountInLess10 - five * Bill_5_USD;
        int one = leftAmountInLess5 / Bill_1_USD;


        System.out.printf("20$ Bills: %d \n", twenty);
        System.out.printf("10$ Bills: %d \n", ten);
        System.out.printf("5$ Bills: %d \n", five);
        System.out.printf("1$ Bills: %d \n", one);


    }
}

