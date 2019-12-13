package robo;

class AlphaRobot extends AbstractRobot {
    private final byte X_Y_MAX_VALUE = 100;
    private final byte X_Y_MIN_VALUE = 0;
    private String name;
    private String model;
    private int x;
    private int y;

    public AlphaRobot(String name, String model) {
        setName(name);
        setModel(model);
        x = 0;
        y = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            System.err.println("Name equal to null error!");
        else
            this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null)
            System.err.println("Model equal to null error!");
        else
            this.model = model;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < X_Y_MIN_VALUE || x > X_Y_MAX_VALUE)
            System.err.println("X value out of range error!");
        else
            this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < X_Y_MIN_VALUE || y > X_Y_MAX_VALUE)
            System.err.println("Y value out of range error!");
        else
            this.y = y;
    }

    public boolean moveRight() {
        if (hasRight())
            setX(++x);
        return x < X_Y_MAX_VALUE;
    }

    public boolean moveLeft() {
        if (hasLeft())
            setX(--x);
        return x > X_Y_MIN_VALUE;
    }

    public boolean moveDown() {
        if (hasDown())
            setY(++y);
        return y < X_Y_MAX_VALUE;
    }

    public boolean moveUp() {
        if (hasUp())
            setY(--y);
        return y > X_Y_MIN_VALUE;
    }

    boolean hasRight() {
        return x + 1 < X_Y_MAX_VALUE;
    }

    boolean hasLeft() {
        return x - 1 > X_Y_MIN_VALUE;
    }

    boolean hasUp() {
        return y - 1 > X_Y_MIN_VALUE;
    }

    @Override
    public String toString() {
        return "AlphaRobot{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    boolean hasDown() {
        return y + 1 < X_Y_MAX_VALUE;
    }

}
