package tests;

import robo.BetaRobot;
import robo.ChargingStation;

public class ChargingStationTest {
    public static int runCase(ChargingStation station, BetaRobot robot) {
        int percentage = 0;

        //first scenario: robot outside of the station range
        station.setCharge((byte) 100);
        station.setX(10);
        station.setY(10);

        robot.setCharge((byte) 50);
        robot.setX(20);
        robot.setY(20);

        if (station.charge(robot)) {
            System.err.println("Charging station Test failed\nREASON: remote charging not allowed!");
            return percentage;
        } else
            percentage += 30;

        //second scenario: robot on the station
        robot.setX(10);
        robot.setY(10);

        if (!station.charge(robot)) {
            System.err.println("Charging station Test failed\nREASON: robot not charging on the station!");
            return percentage;
        } else
            percentage += 30;


        return percentage;
    }
}
