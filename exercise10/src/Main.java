import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of calories and fat grams: ");
        int calories = in.nextInt();
        int fat = in.nextInt();

        double caloriesFromFat = fat * 9;
        double percentageCaloriesFromFat = (caloriesFromFat / calories) * 100;

        if(percentageCaloriesFromFat > 30)
            System.out.printf("The percentage of calories from fat is %.0f%%\n", percentageCaloriesFromFat);
        else
            System.out.printf("The percentage of calories from fat is %.0f%%. This food is low in fat.\n", percentageCaloriesFromFat);


    }

}
