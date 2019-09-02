import java.util.Scanner;

public class TestIJ {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i=1; i<= number; i++)
        System.out.println("Hello IJ!");
    }
}
