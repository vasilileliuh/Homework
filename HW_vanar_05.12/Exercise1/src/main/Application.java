package main;

import geometry.Line;

public class Application {
    public static void main(String[] args) {

        testA();
        testB();

    }

    private static void testA() {
        System.out.println("Test \"A\"");
        Line short_horizontal_line = new Line(100, 0, 200, 0);
        short_horizontal_line.printCoords();
        System.out.println(short_horizontal_line.length());
    }

    private static void testB() {
        System.out.println("Test \"B\"");
        Line long_diagonal_line = new Line(100, 100, 500, 500);
        long_diagonal_line.printCoords();
        System.out.println(long_diagonal_line.length());
    }
}
