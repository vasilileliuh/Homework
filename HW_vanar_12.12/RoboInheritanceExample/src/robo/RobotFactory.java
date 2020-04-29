package robo;

public class RobotFactory {
    public static AbstractRobot getRobot(String name, String model) {
        AbstractRobot robot = null;
        if (model == null)
            return null;
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
                    System.err.println("Robot model out of bounds!");
            }
            return robot;
        }
    }
}
