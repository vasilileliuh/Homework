import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter the number:  ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

            int sum = 0;
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if(number == 0) {
                    System.out.println("Circle is done. ");
                    break;
                }
                System.out.println("Enter the next number: ");
                number = in.nextInt();
                sum += number;
                System.out.println("The sum is " + sum);
            }

     }
}

