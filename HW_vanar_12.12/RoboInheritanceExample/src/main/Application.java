package main;

import robo.AbstractRobot;
import robo.AlphaRobot;
import robo.BetaRobot;
import tests.ChargeTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {

        System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );

        System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new BetaRobot("Robo","beta") ) );

        System.out.printf( "Charge test passed %d%%\n", ChargeTest.runCase( new BetaRobot("Robo1","beta1")));
    }
}
