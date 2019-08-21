
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        pi/4 = 1 - 1/3 + 1/5 - 1/7 +- ...
        double quarterPi = 1;
        int signSymbol = -1;
        double startValue = 3;
        while (startValue < 10_000)
        {
            quarterPi = quarterPi + signSymbol / startValue;
            startValue += 2;
            signSymbol *= -1;
        }
        System.out.println("The value of pi is: " + 4 * quarterPi);

//        System.out.println();
//        System.out.println("Enter number of iterations to calculate value of PI .");
//        System.out.println();
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//
//        int i=3; double startNumber =4;
//        for (int j = 1; j <= number; j++) {
//
//            double pi = startNumber - ((CONSTANT_NUMBER_IN_PI_CALCULATING_FORMULA / i)) * j + ((CONSTANT_NUMBER_IN_PI_CALCULATING_FORMULA / (i + 2))) * j;
//
//            double block1 = CONSTANT_NUMBER_IN_PI_CALCULATING_FORMULA / i;
//            double block2 = CONSTANT_NUMBER_IN_PI_CALCULATING_FORMULA / (i + 2);
//
//            System.out.printf("Calculated value of PI is %.6f block1=%.6f, block2=%.6f \n", pi, block1, block2);
//
//            i += 4;
//            startNumber = pi;
//        }


    }
}
