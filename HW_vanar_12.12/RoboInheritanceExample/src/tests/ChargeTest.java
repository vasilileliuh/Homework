package tests;

import robo.BetaRobot;

public class ChargeTest {
    public static int runCase(BetaRobot robot) {
        int percentage = 0;

        if (robot.setCharge(-100)) {
            System.err.println("Charge negative value test failed\nREASON: negative charge not allowed!");
            return percentage;
        }
        percentage += 30;

        if (robot.setCharge(1000)) {
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
