import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListExample {

    private static final int FIFTY_YEARS = 50;
    private static final int THIRTY_YEARS = 30;


    public static void main(String[] args) {

        LocalDate currentYear = LocalDate.now();
        int year = currentYear.getYear();

        ArrayList<Integer> dates = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            dates.add(random.nextInt(120) + 1900);
            System.out.println(dates.get(i));
        }

        System.out.println("Persons younger than 50 years: ");
        for (Integer date : dates) {
            if (year - date < FIFTY_YEARS)
                System.out.println(date);
        }

        ArrayList<Integer> youngDates = new ArrayList<>();
        for (int i = 0; i < dates.size(); i++) {
            if (year - dates.get(i) < THIRTY_YEARS)
                youngDates.add(dates.get(i));
        }

        System.out.println("Persons younger than 30 years: ");
        while (youngDates.size() > 0) {
            System.out.println(youngDates.get(0));
            youngDates.remove(0);
        }
    }
}
