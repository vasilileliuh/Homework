package com.company;

public class StopWatchDemo {
    public static void main(String[] args) {
        StopWatch one = new StopWatch();

        int i, m, flag = 0;
        int n = 1000008900;//it is the number to be checked
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }//end of else

        System.out.println();
        one.stop();
        System.out.println(one);
        System.out.println("Elapsed time = " + one.getElapsedTime());
    }
}
