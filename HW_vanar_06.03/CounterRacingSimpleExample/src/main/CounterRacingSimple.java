package main;

public class CounterRacingSimple {

    public static void main(String[] args) {
        // 1)
        new CounterRacingSimple().doCounter();
    }

    private int count = 0;

    private synchronized void increment() {
        count++;
    }

    private void doCounter() {
        // 2)
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                // 3)
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
                System.out.println("t1: " + count);

            }
        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    increment();
                }
                System.out.println("t2: " + count);

            }
        });
        // 4)
        t1.start();
        t2.start();
    }
}
