import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OccurrenceApp {
    public static void main(String[] args) /*throws IOException*/ {

        System.out.println("Enter the integers between 1 and 100:");
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[100];
        int number, i = 0;
        while ((number = in.nextInt()) != 0) {
            numbers[i++] = number;
        }
        for (int j = 0; j < numbers.length; j++) {
            for (int k = 0; k < numbers.length - 1; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = temp;
                }
            }
//            More efficient sorting method
/*            for (int k = i; k > 0; k--) {
                if (numbers[k] < numbers[k - 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k - 1];
                    numbers[k - 1] = temp;
                }
            }*/
        }
        for (int j = 0; j < numbers.length; j++) {
            int occurrence = 0;
            int result = numbers[j];
            for (int n : numbers) {
                if (result == n)
                    occurrence++;
            }
            if (occurrence > 0 && numbers[j] != 0) {
                j += occurrence - 1;
                System.out.println(
                        result + " occurs " + occurrence + (occurrence > 1 ? " times" : " time")
                );
            }
        }

//        Second solution using Java ArrayList class

//        System.out.println("Enter the integers between 1 and 100:");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        List<Integer> numbers = new ArrayList<>();
//        int number;
//        while ((number = Integer.parseInt(reader.readLine())) != 0) {
//            numbers.add(number);
//        }
//        Collections.sort(numbers);
//        for (int i = 0; i < numbers.size(); i++) {
//            int occurrence = 0;
//            int result = numbers.get(i);
//            for (Integer n : numbers) {
//                if (result == n)
//                    occurrence++;
//            }
//            if (occurrence > 0)
//                i += occurrence - 1;
//            System.out.println(result + " occurs " + occurrence + (occurrence > 1 ? " times" : " time"));
//        }
    }
}
