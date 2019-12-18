package robo;

public class StationFactory {

    public static ChargingStation getStation(int x, int y) {
        final byte X_Y_MAX_VALUE = 100;
        final byte X_Y_MIN_VALUE = 0;

        ChargingStation station = new ChargingStation();

        if ((x < X_Y_MIN_VALUE || x > X_Y_MAX_VALUE) || (y < X_Y_MIN_VALUE || y > X_Y_MAX_VALUE))
            return null;
        else {
            station.setX(x);
            station.setY(y);
        }
        return station;
    }
}

