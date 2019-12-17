package robo;

public abstract class AbstractRobot implements Movable2DInterface, Has2DCoordinatesInterface {
    // Robot schema
    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setModel(String model);

    public abstract String getModel();
}
