public class Application {
    public static void main(String[] args) {

        Car m = new Car("Mercedes");
        Car f = new Car("Fiat", "DEF-456");
        Car b = new Car("BMW");
        m.setId("ABC-123");

        m.printCar();
        f.printCar();
        b.printCar();

        Parking kaufland = new Parking();
        kaufland.parkCar(m, "1A");
        kaufland.parkCar(b, "2B");
        kaufland.parkCar(f, "2C");
//        wrong parking spot
        kaufland.parkCar(m, "3A");

        kaufland.freePlaces();
        kaufland.printMap();

        kaufland.removeCarFromParking(b);

        kaufland.freePlaces();
        kaufland.printMap();
    }
}
