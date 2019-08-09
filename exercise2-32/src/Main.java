import java.util.Scanner;

public class Main {

   /* int a;
    *int b;
    *int c;
    *int d;
    *int e;
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int countOfPositiveIntegers=0;
        int countOfNegativeIntegers=0;
        int countOfZeroIntegers=0;

        System.out.print("Input first number(from positive, negative or equal to zero): ");
        int a = in.nextInt();
        System.out.print("Input second number(from positive, negative or equal to zero): ");
        int b = in.nextInt();
        System.out.print("Input third number (from positive, negative or equal to zero): ");
        int c = in.nextInt();
        System.out.print("Input fourth number (from positive, negative or equal to zero): ");
        int d = in.nextInt();
        System.out.print("Input fifth number (from positive, negative or equal to zero): ");
        int e = in.nextInt();

        // counting positive and negative numbers

        if (a>0) {
            ++countOfPositiveIntegers;
        }else if (a < 0) {
            ++countOfNegativeIntegers;
        }else {
            ++countOfZeroIntegers;
        }
        if (b>0) {
            ++countOfPositiveIntegers;
        }else if (b < 0) {
            ++countOfNegativeIntegers;
        }else {
            ++countOfZeroIntegers;
        }
        if (c>0) {
            ++countOfPositiveIntegers;
        }else if (c < 0) {
            ++countOfNegativeIntegers;
        }else {
            ++countOfZeroIntegers;
        }
        if (d>0) {
            ++countOfPositiveIntegers;
        }else if (d < 0) {
            ++countOfNegativeIntegers;
        }else {
            ++countOfZeroIntegers;
        }
        if (e>0) {
            ++countOfPositiveIntegers;
        }else if (e < 0) {
            ++countOfNegativeIntegers;
        }else {
            ++countOfZeroIntegers;
        }


        System.out.println();
        System.out.printf("Quantity of positive numbers = %d\n",countOfPositiveIntegers);
        System.out.printf("Quantity of negative numbers = %d\n",countOfNegativeIntegers);
        System.out.printf("Quantity of zero numbers = %d\n",countOfZeroIntegers);



    }
}
