package tests;

import robo.BetaRobot;
import robo.ChargingStation;

public class ChargingStationTest {
    public static int runCase(ChargingStation station, BetaRobot robot) {
        int percentage = 0;

        //first scenario: robot outside of the station range
        station.setCharge(100);
        station.setX(10);
        station.setY(10);

        robot.setCharge(50);
        robot.setX(20);
        robot.setY(20);

        if (station.charge(robot)) {
            System.err.println("Charging station Test failed\nREASON: remote charging not allowed!");
            return percentage;
        } else
            percentage += 30;

        //second scenario: robot on the station
        for (int i = 0; i < 10; i++) {
            robot.moveUp();
            robot.moveLeft();
        }

        if (station.charge(robot)) {
            System.err.println("Charging station Test failed\nREASON: robot not charging on the station!");
            return percentage;
        } else
            percentage += 30;


        return percentage;
    }
}
