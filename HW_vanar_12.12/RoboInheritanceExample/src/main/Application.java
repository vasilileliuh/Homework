package main;

import robo.*;
import tests.ChargeTest;
import tests.ChargingStationTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {

        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("Robik", "alpha")));

        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("Robot", "beta")));
        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase((BetaRobot) RobotFactory.getRobot("Robot", "beta")));

        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(RobotFactory.getRobot("Robot2", "charlie")));
        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase((CharlieRobot) RobotFactory.getRobot("Robot2", "charlie")));
        System.out.printf("DiagonalWalkTest test passed %d%%\n", DiagonalWalkTest.runCase((CharlieRobot) RobotFactory.getRobot("Robot2", "charlie")));

        AbstractRobot robo = RobotFactory.getRobot("Apollo", "alpha");
        AbstractRobot robo1 = RobotFactory.getRobot("Bobo", "beta");
        AbstractRobot robo2 = RobotFactory.getRobot("Chris", "charlie");
        AbstractRobot robo3 = RobotFactory.getRobot("Billy", "beta");

        System.out.println(robo);
        System.out.println(robo1);
        System.out.println(robo2);
        System.out.println(robo3);

//        System.out.printf("Charging station test passed %d%%\n", ChargingStationTest.runCase(StationFactory.getStation(0, 0), (BetaRobot) robo3));
//        System.out.println(robo3);

        ChargingStation first = StationFactory.getStation(0, 0);
        first.setCharge(55);
        System.out.println("first station charge = " + first.getCharge());
        System.out.println(first.toString());
    }
}
