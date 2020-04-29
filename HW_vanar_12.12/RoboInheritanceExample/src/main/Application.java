package main;

import robo.*;
import tests.ChargeTest;
import tests.ChargingStationTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {

        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("Robin", "alpha")));

        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("Robot", "beta")));
        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase((BetaRobot) RobotFactory.getRobot("Robot", "beta")));

        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("Robot2", "charlie")));
        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase((CharlieRobot) RobotFactory.getRobot("Robot2", "charlie")));
        System.out.printf("DiagonalWalkTest test passed %d%%\n", DiagonalWalkTest.runCase((CharlieRobot) RobotFactory.getRobot("Robot2", "charlie")));

        AbstractRobot robot1 = RobotFactory.getRobot("Chris", "charlie");
        AbstractRobot robot2 = RobotFactory.getRobot("Billy", "beta");

        System.out.printf("Charging Station test passed %d%%\n", ChargingStationTest.runCase(StationFactory.getStation(0, 0), (BetaRobot) robot1));
        System.out.println(robot1);
        ChargingStation first = StationFactory.getStation(10, 10);
        System.out.printf("Charging Station test passed %d%%\n", ChargingStationTest.runCase(first, (BetaRobot) robot2));
        System.out.println(robot2);
        System.out.println(first);

    }
}
