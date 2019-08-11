import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello World!");


        Scanner in = new Scanner(System.in);
        System.out.print("Enter two digits, smaller first: ");
        int firstDigit = in.nextInt();
        int secondDigit = in.nextInt();

        int sum = 0;
        for (int i = firstDigit; i <= secondDigit; i++){
            sum += i;

//            System.out.println(sum);
        }
        System.out.printf("The sum of all integers between %d and %d is %d \n",firstDigit, secondDigit, sum);

    }
}
