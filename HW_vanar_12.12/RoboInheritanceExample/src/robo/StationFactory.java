package robo;

public class StationFactory {

    public static ChargingStation getStation(int x, int y) {

        return new ChargingStation(x, y);
    }
}

