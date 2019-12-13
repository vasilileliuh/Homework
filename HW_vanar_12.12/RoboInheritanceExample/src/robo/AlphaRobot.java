package robo;

public class AlphaRobot extends AbstractRobot {
    private String name;
    private String model;
    private int x;
    private int y;

    AlphaRobot() {
        x = 0;
        y = 0;
    }

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
        if (x < 0 || x > 100)
            System.err.println("X value out of range error!");
        else
            this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0 || y > 100)
            System.err.println("Y value out of range error!");
        else
            this.y = y;
    }

    public boolean moveRight() {
        if (x + 1 <= 100)
            setX(++x);
        return x <= 100;
    }

    public boolean moveLeft() {
        if (x - 1 >= 0)
            setX(x--);
        return x - 1 >= 0;
    }

    public boolean moveDown() {
        if (y + 1 <= 100)
            setY(y++);
        return y + 1 <= 100;
    }

    public boolean moveUp() {
        if (y - 1 >= 0)
            setY(y--);
        return x - 1 >= 0;
    }

}
