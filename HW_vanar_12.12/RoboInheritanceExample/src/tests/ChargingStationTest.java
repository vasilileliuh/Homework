package tests;

import robo.BetaRobot;
import robo.ChargingStation;

public class ChargingStationTest {
    public static int runCase(ChargingStation station, BetaRobot robot) {
        final int ONE_HUNDRED_PERCENT = 100;
        final int TESTS_QUANTITY = 3;
        int quantityTestsPassed = 0;

        //first scenario: robot outside of the station range
        station.setCharge(100);
        station.setX(10);
        station.setY(10);

        robot.setCharge(50);
        robot.setX(20);
        robot.setY(20);

        if (station.charge(robot)) {
            System.err.println("Charging station Test failed\nREASON: remote charging not allowed!");
            return ONE_HUNDRED_PERCENT * quantityTestsPassed / TESTS_QUANTITY;
        } else
            quantityTestsPassed += 1;

        //second scenario: robot on the station
        for (int i = 0; i < 10; i++) {
            robot.moveUp();
            robot.moveLeft();
        }
        if (station.charge(robot))
            quantityTestsPassed += 1;
        else {
            System.err.println("Charging station Test failed\nREASON: robot not charging on the station!");
            return ONE_HUNDRED_PERCENT * quantityTestsPassed / TESTS_QUANTITY;
        }

        //third scenario: already charged robot on the station
        if (station.charge(robot)) {
            System.err.println("Charging station Test failed\nREASON: charging more than 100% not allowed!");
            return ONE_HUNDRED_PERCENT * quantityTestsPassed / TESTS_QUANTITY;
        } else
            quantityTestsPassed += 1;

        return ONE_HUNDRED_PERCENT * quantityTestsPassed / TESTS_QUANTITY;
    }
}
