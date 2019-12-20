package robo;

public class ChargingStation implements HasBatteryInterface, Has2DCoordinatesInterface {

    private final byte X_Y_MAX_VALUE = 100;
    private final byte X_Y_MIN_VALUE = 0;
    private byte CHARGE_MAX_VALUE = 100;
    private int x;
    private int y;
    private byte charge;

    ChargingStation(int x, int y) {
        setX(x);
        setY(y);
        setCharge(0);
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

    private boolean hasStationEnoughCharge() {
        byte LOW_CHARGE_PERCENTAGE = 5;
        return charge - 1 >= LOW_CHARGE_PERCENTAGE;
    }

    private boolean isChargeValueWithinRange(int charge) {
        byte CHARGE_MIN_VALUE = 0;
        return charge > CHARGE_MIN_VALUE && charge <= CHARGE_MAX_VALUE;
    }

    public boolean charge(HasBatteryInterface chargeable) {
        byte counter = 0;
        if (hasStationAbilityToCharge(chargeable)) {
            while (hasStationAbilityToCharge(chargeable)) {
                chargeable.setCharge(chargeable.getCharge() + 1);
                counter++;
                if (counter % 10 == 0)
                    setCharge(getCharge() - 1);
            }
            return true;
        } else return false;
    }

    private boolean isRobotConnected(Has2DCoordinatesInterface coordinate) {
        return coordinate.getX() == getX() && coordinate.getY() == getY();
    }

    private boolean hasStationAbilityToCharge(HasBatteryInterface chargeable) {
        return chargeable.getCharge() < CHARGE_MAX_VALUE && hasStationEnoughCharge() &&
                isRobotConnected((Has2DCoordinatesInterface) chargeable);
    }

    @Override
    public String toString() {
        return "ChargingStation{" +
                "x= " + x +
                ", y= " + y +
                ", charge= " + charge +
                '}';
    }

}
