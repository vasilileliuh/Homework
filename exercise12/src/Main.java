import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"air\", \"water\" or \"steel\" and the distance in feet: ");
        String environment = in.nextLine().toLowerCase();
        double distance = in.nextInt();

        switch (environment){
            case "air":
                 double time = distance / 1100;
                System.out.printf("It will take sound to travel: %.2f seconds \n", time);
                break;
            case "water":
                double time2 = distance / 4900;
                System.out.printf("It will take sound to travel: %.2f seconds \n", time2);
                break;
            case "steel":
                double time3 = distance / 16400;
                System.out.printf("It will take sound to travel: %.2f seconds \n", time3);
                break;
                default:
                System.out.print("Entered wrong number");

        }
    }
}
