import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your height in inches: ");
        int num = in.nextInt();
        int numfeet = num/12;
        int numfeetinteger = numfeet * 12;
        int numinches = num - numfeetinteger;

        System.out.printf("Your height is: %d feet %d inches \n", numfeet, numinches);
    }
}
