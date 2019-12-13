package main;

import robo.*;
import tests.ChargeTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {

        RobotFactory factory = new RobotFactory();

//        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new AlphaRobot("Robik", "alpha")));
//
//        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new BetaRobot("Robot", "beta")));
//        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase(new BetaRobot("Robot", "beta")));
//
//        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new CharlieRobot("Robot2", "charlie")));
//        System.out.printf("Charge test passed %d%%\n", ChargeTest.runCase(new CharlieRobot("Robot2", "charlie")));
//        System.out.printf("DiagonalWalkTest test passed %d%%\n", DiagonalWalkTest.runCase(new CharlieRobot("Robot2", "charlie")));
//
//        AbstractRobot robo = RobotFactory.getRobot("alpha", "Apollo");
//        AbstractRobot robo1 = RobotFactory.getRobot("beta", "Bobo");
//        AbstractRobot robo2 = RobotFactory.getRobot("charlie", "Chris");
//        System.out.println(robo);
//        System.out.println(robo1);
//        System.out.println(robo2);

        AbstractRobot robo = factory.getRobot("Robic", "alpha");
        System.out.println(robo);

    }
}
