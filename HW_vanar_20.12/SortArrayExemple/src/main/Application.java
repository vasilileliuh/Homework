package main;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int[] data = {100, 200, 300, 400, 500};

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first array index to switch place(among 0, 1, 2, 3, 4): ");
        int firstIndex = in.nextInt();
        System.out.println("Please enter last array index to switch place(among 0, 1, 2, 3, 4): ");
        int lastIndex = in.nextInt();

        if ((firstIndex >= 0 && firstIndex < data.length) &&
                (lastIndex >= 0 && lastIndex < data.length)) {
            if (firstIndex > lastIndex) {
                int temp = firstIndex;
                firstIndex = lastIndex;
                lastIndex = temp;
            }
            int first = data[firstIndex];
            int last = data[lastIndex];
            for (int i = 0; i < data.length; i++) {
                if (i == firstIndex)
                    data[i] = last;
                if (i == lastIndex) {
                    data[i] = first;
                    break;
                }
            }
        } else
            System.err.println("Array index out of bound error!");

        for (int number : data) {
            System.out.println(number);
        }


    }

}
