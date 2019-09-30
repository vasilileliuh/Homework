import java.time.LocalDate;
import java.util.Scanner;

public class ProgrammersDateDemo {
    private static final int PROGRAMMERS_DAY = 256;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int usersYear = in.nextInt();
        LocalDate date = LocalDate.of(usersYear, 01, 01);
        System.out.println("Programmer's day in " + usersYear + " is on " + date.withDayOfYear(256) + " date.");

//       second variant
        LocalDate date2 = LocalDate.ofYearDay(usersYear, PROGRAMMERS_DAY);
        System.out.println(date2);
    }
}
