package robo;

public class RobotFactory {
    public static AbstractRobot getRobot(String model, String name) {
        AbstractRobot robot = null;
        if (model == null)
            return robot;
        else {
            switch (model) {
                case "alpha":
                    robot = new AlphaRobot(name, "alpha");
                    break;
                case "beta":
                    robot = new BetaRobot(name, "beta");
                    break;
                case "charlie":
                    robot = new CharlieRobot(name, "charlie");
                    break;
                default:
                    System.out.println("Robot model out of bounds!");
            }
            return robot;
        }

    }
}
