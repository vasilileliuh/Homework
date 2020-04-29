package main;

public class Application {
    public static void main(String[] args) throws Error {

//        for (int i = 178_894_100; i < Integer.MAX_VALUE; i++) {
//            double[] doubleArray = new double[i];
//            System.out.println(doubleArray.length);
//        }
        int counter = Integer.MAX_VALUE;
        double[] doubleArray;
        while (true) {
//           counter = counter / 10;
            try {
                doubleArray = new double[counter];
                System.out.println(doubleArray.length);
            } catch (OutOfMemoryError e) {
                counter -= 10_000_000;
            }
            counter += 10_000;

        }


    }
}
