import java.util.Scanner;

public class LetterCounterDemo {

    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = in.nextLine();

        LetterCounter b = new LetterCounter();

        System.out.println("The number of uppercase letters is " + b.countUppercaseLetters(a));
    }


}
