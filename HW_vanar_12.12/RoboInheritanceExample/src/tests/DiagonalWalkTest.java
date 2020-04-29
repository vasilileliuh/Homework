package tests;

import robo.CharlieRobot;

public class DiagonalWalkTest {
    public static int runCase(CharlieRobot robot) {

        int percentage = 0;

        robot.setCharge(50);
        robot.setX(100);
        robot.setY(99);

        if (robot.moveDownRight()) {
            System.err.println("Move down right test failed\nREASON: moveDownRight() out of bounds!");
            return percentage;
        }
        percentage += 25;

        if (robot.moveDownLeft()) {
            System.err.println("Move down left test failed\nREASON: moveDownLeft() out of bounds!");
            return percentage;
        }
        percentage += 25;

        robot.setY(0);

        if (robot.moveUpRight()) {
            System.err.println("Move up right test failed\nREASON: moveUpRight() out of bounds!");
            return percentage;
        }
        percentage += 25;

        if (robot.moveUpLeft()) {
            System.err.println("Move up left test failed\nREASON: moveUpLeft() out of bounds!");
            return percentage;
        }
        percentage += 25;

        return percentage;
    }
}
