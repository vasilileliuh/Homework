import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter two numbers: first for number and second for range");
        Scanner in = new Scanner(System.in);
        int firstDigit = in.nextInt();
        int secondDigit = in.nextInt();

        int program = 0;
        for (int i = 1; i <= secondDigit; i++) {
            program = firstDigit * i;
            System.out.printf("Multiplication table for %d x %d = %d\n", firstDigit, i, program);

        }
    }
}
