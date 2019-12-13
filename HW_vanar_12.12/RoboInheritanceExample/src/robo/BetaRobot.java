package robo;

public class BetaRobot extends AlphaRobot {

    final private byte LOW_CHARGE_PERCENTAGE = 5;
    private String name;
    private String model;
    private int x;
    private int y;
    private byte charge;  // - заряд! (0..100)

    public BetaRobot(String name, String model) {
        super(name, model);
        x = 0;
        y = 0;
        charge = 0;
    }


    public byte getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        if (charge < 0 || charge > 100)
            System.err.println("Charge out of range error!");
        else
            this.charge = (byte) charge;
    }

    public boolean moveRight() {
        boolean isMoveRightOk = false;
        if (charge - 1 >= LOW_CHARGE_PERCENTAGE) {
            isMoveRightOk = super.moveRight();
            if (x % 2 == 0)
                charge--;
            System.out.println("Test x values = " + x);
        }
        return isMoveRightOk && (charge - 1 >= LOW_CHARGE_PERCENTAGE);
    }

    public boolean moveLeft() {
        if (charge - 1 >= LOW_CHARGE_PERCENTAGE) {
            setX(x--);
            if (x % 2 == 0)
                charge--;
        }
        return !(x < 0 || x > 100) && (charge - 1 >= LOW_CHARGE_PERCENTAGE);
    }

    public boolean moveDown() {
        if (charge - 1 >= LOW_CHARGE_PERCENTAGE) {
            setY(y++);
            if (y % 2 == 0)
                charge--;
        }
        return !(y < 0 || y > 100) && (charge - 1 >= LOW_CHARGE_PERCENTAGE);
    }

    public boolean moveUp() {
        if (charge - 1 >= LOW_CHARGE_PERCENTAGE) {
            setY(y--);
            if (y % 2 == 0)
                charge--;
        }
        return !(y < 0 || y > 100) && (charge - 1 >= LOW_CHARGE_PERCENTAGE);
    }
}
