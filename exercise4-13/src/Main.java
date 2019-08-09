import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.println();

            Scanner in = new Scanner(System.in);
            System.out.print("Enter a letter: ");
            String unCapsedLetter = in.nextLine();
            String letterToChart = unCapsedLetter.toLowerCase();
            char letter = letterToChart.charAt(0);
            char outLetter = unCapsedLetter.charAt(0);

            if( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.printf("%c is a vowel \n", outLetter);
            }else if(letter =='q' || letter =='w' || letter == 'r' || letter =='t' || letter =='y' || letter =='p'
                      || letter == 's' || letter == 'd' || letter == 'f' || letter == 'g' || letter == 'h' || letter == 'j' || letter == 'k'
                      || letter == 'l' || letter == 'z' || letter == 'x' || letter == 'c' || letter == 'v' || letter == 'b' || letter == 'n'
                      || letter == 'm'){
                System.out.printf("%c is a consonant \n", outLetter);
            }else
                System.out.printf("%c is an invalid input \n", outLetter);


    }
}




