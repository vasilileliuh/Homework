import java.util.Scanner;

public class Main {

    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOURS_IN_DAY = 24;


    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        long seconds = in.nextInt();

        long days = seconds / (SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY);
        long leftHoursInSeconds = seconds - days * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;
        long hours = leftHoursInSeconds /(SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
        long leftMinutesInSeconds = leftHoursInSeconds - hours * SECONDS_IN_MINUTE * MINUTES_IN_HOUR;
        long minutes = leftMinutesInSeconds / SECONDS_IN_MINUTE;
        long leftSeconds = leftMinutesInSeconds - minutes * SECONDS_IN_MINUTE;


        System.out.printf("%d seconds = %d days, %d hours, %d minutes %d seconds \n", seconds, days, hours, minutes, leftSeconds);


    }
}

