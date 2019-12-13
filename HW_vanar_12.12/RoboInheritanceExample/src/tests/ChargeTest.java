package tests;

import robo.BetaRobot;
import robo.RobotFactory;
import robo.AbstractRobot;

public class ChargeTest {
    public static int runCase(RobotFactory BetaRobot) {
        AbstractRobot robot = BetaRobot.getRobot("beta", "Bobo");
        int percentage = 0;

        robot.setCharge(-100);
        if (robot.getCharge() == -100) {
            System.err.println("Charge negative value test failed\nREASON: negative charge not allowed!");
            return percentage;
        }
        percentage += 30;

        robot.setCharge(1000);
        if (robot.getCharge() == 1000) {
            System.err.println("Charge over 100% test failed\nREASON: charge over 100% not allowed!");
            return percentage;
        }
        percentage += 30;

        robot.setCharge(50);
        for (int i = 0; i < 100; i++) {
            if (!robot.moveRight())
                i = 100;
        }
        System.out.println("Robot min charge level= " + robot.getCharge());
        percentage += 40;

        return percentage;
    }
}
