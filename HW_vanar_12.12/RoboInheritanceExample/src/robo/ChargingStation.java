package robo;

public class ChargingStation extends BetaRobot implements HasBatteryInterface, Has2DCoordinatesInterface {

    ChargingStation() {
        super.setCharge(10);
    }

    public boolean charge(HasBatteryInterface chargeable) {
        byte counter = 0;
        while (chargeable.getCharge() < CHARGE_MAX_VALUE && super.isChargeOk() &&
                isRobotConnected((Has2DCoordinatesInterface) chargeable)) {
            for (int i = 1; i <= 10; i++) {
                if (chargeable.setCharge(chargeable.getCharge() + i))
                    counter++;
            }
            if (counter % 10 == 0)
                super.setCharge(super.getCharge() - 1);
        }
        return chargeable.getCharge() < CHARGE_MAX_VALUE && super.isChargeOk() &&
                isRobotConnected((Has2DCoordinatesInterface) chargeable);
    }

    private boolean isRobotConnected(Has2DCoordinatesInterface coordinate) {
        return coordinate.getX() == super.getX() && coordinate.getY() == super.getY();
    }


}
