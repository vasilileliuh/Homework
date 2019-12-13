package main;

import robo.*;
import tests.ChargeTest;
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

    }
}
