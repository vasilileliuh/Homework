import java.util.Scanner;

public class CountPozitiveAndNegativeV {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        System.out.println();
        boolean running = true;
        int i = 1, j = 1, positives = 0, numberOfPozitives = 0, negatives = 0, numberOfNegatives = 0;
        while(running){
               int c = in.nextInt();
                if (c > 0) {
                    positives += c;
                    numberOfPozitives = i++;
                }else if (c < 0) {
                     negatives += c;
                     numberOfNegatives = j++;
                }else
                    running = false;

                }
        if (numberOfPozitives == 0 && numberOfNegatives ==0)
            System.out.println("No numbers are entered except 0");
        else {
            System.out.printf("The number of positives is %d: \n", numberOfPozitives);
            System.out.printf("The number of negatives is %d: \n", numberOfNegatives);
            System.out.printf("The total is %d: \n", positives + negatives);
            System.out.printf("The average is %.2f: ", (double) (positives + negatives) / (numberOfNegatives + numberOfPozitives));
        }
        }
    }