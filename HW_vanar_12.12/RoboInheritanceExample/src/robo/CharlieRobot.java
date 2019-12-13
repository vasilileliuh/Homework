package robo;

class CharlieRobot extends BetaRobot {

    public CharlieRobot(String name, String model) {
        super(name, model);
    }

    public boolean moveDownRight() {
        if (hasDown() && hasRight()) {
            moveDown();
            moveRight();
        }
        return hasDown() && hasRight();
    }

    public boolean moveDownLeft() {
        if (hasDown() && hasLeft()) {
            moveDown();
            moveLeft();
        }
        return hasDown() && hasLeft();
    }

    public boolean moveUpRight() {
        if (hasUp() && hasRight()) {
            moveUp();
            moveRight();
        }
        return hasUp() && hasRight();
    }

    public boolean moveUpLeft() {
        if (hasUp() && hasLeft()) {
            moveUp();
            moveLeft();
        }
        return hasUp() && hasLeft();
    }

    @Override
    public String toString() {
        return "CharlieRobot{" + super.toString() + "}";
    }

}
