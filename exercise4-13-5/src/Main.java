import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter alphabet letter: ");
        char alphabetLetter = in.next().toLowerCase().charAt(0);

        switch (alphabetLetter) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
                System.out.printf("\'%c\' is vowel", alphabetLetter);
                break;
            case 'q':
            case 'w':
            case 'r':
            case 't':
            case 'y':
            case 'p':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'z':
            case 'x':
            case 'c':
            case 'v':
            case 'b':
            case 'n':
            case 'm':
                System.out.printf("\'%s\' is consonant",alphabetLetter);
                break;
            default:
                System.out.println("Please enter the correct alphabet character");
        }
    }
}
