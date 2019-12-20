package robo;

public class BetaRobot extends AlphaRobot implements HasBatteryInterface {
    private byte charge;
    private boolean isMoveOk = false;

    BetaRobot(String name, String model) {
        super(name, model);
        charge = 0;
    }

    public byte getCharge() {
        return charge;
    }

    public boolean setCharge(int charge) {
        if (isChargeValueWithinRange(charge))
            this.charge = (byte) charge;
        else
            System.err.println("Charge out of range error!");
        return isChargeValueWithinRange(charge);
    }

    @Override
    public boolean moveRight() {
        if (isChargeOk()) {
            isMoveOk = super.moveRight();
            if (getX() % 2 == 0)
                charge--;
        }
        return isMoveOk && isChargeOk();
    }

    @Override
    public boolean moveLeft() {
        if (isChargeOk()) {
            isMoveOk = super.moveLeft();
            if (getX() % 2 == 0)
                charge--;
        }
        return isMoveOk && isChargeOk();
    }

    @Override
    public boolean moveDown() {
        if (isChargeOk()) {
            isMoveOk = super.moveDown();
            if (getY() % 2 == 0)
                charge--;
        }
        return isMoveOk && isChargeOk();
    }

    @Override
    public boolean moveUp() {
        if (isChargeOk()) {
            isMoveOk = super.moveUp();
            if (getY() % 2 == 0)
                charge--;
        }
        return isMoveOk && isChargeOk();
    }

    private boolean isChargeOk() {
        byte LOW_CHARGE_PERCENTAGE = 5;
        return charge - 1 >= LOW_CHARGE_PERCENTAGE;
    }

    private boolean isChargeValueWithinRange(int charge) {
        byte CHARGE_MIN_VALUE = 0;
        byte CHARGE_MAX_VALUE = 100;
        return charge > CHARGE_MIN_VALUE && charge <= CHARGE_MAX_VALUE;
    }

    @Override
    public String toString() {
        return "BetaRobot{" + super.toString() + ", charge= '" + charge + "'}";
    }
}
