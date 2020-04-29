public class Parking {
    private byte freePlaces;
    private Car place1A;
    private Car place1B;
    private Car place1C;
    private Car place2A;
    private Car place2B;
    private Car place2C;

    Parking() {
        freePlaces = 6;
    }

    public Parking(Car place1A, Car place1B, Car place1C, Car place2A, Car place2B, Car place2C) {
        freePlaces = 6;
        this.place1A = place1A;
        this.place1B = place1B;
        this.place1C = place1C;
        this.place2A = place2A;
        this.place2B = place2B;
        this.place2C = place2C;
    }

    void parkCar(Car car, String place) {
        switch (place) {
            case "1A":
                if (place1A == null) {
                    place1A = car;
                    freePlaces--;
                } else
                    System.out.println("This place is occupied!");
                break;
            case "1B":
                if (place1B == null) {
                    place1B = car;
                    freePlaces--;
                } else
                    System.out.println("This place is occupied!");
                break;
            case "1C":
                if (place1C == null) {
                    place1C = car;
                    freePlaces--;
                } else
                    System.out.println("This place is occupied!");
                break;
            case "2A":
                if (place2A == null) {
                    place2A = car;
                    freePlaces--;
                } else
                    System.out.println("This place is occupied!");
                break;
            case "2B":
                if (place2B == null) {
                    place2B = car;
                    freePlaces--;
                } else
                    System.out.println("This place is occupied!");
                break;
            case "2C":
                if (place2C == null) {
                    place2C = car;
                    freePlaces--;
                } else
                    System.out.println("This place is occupied!");
                break;
            default:
                System.err.println("Wrong place number!");
        }
    }

    void removeCarFromParking(Car car) {
        if (car == place1A) {
            place1A = null;
            freePlaces++;
        } else if (car == place1B) {
            place1B = null;
            freePlaces++;
        } else if (car == place1C) {
            place1C = null;
            freePlaces++;
        } else if (car == place2A) {
            place2A = null;
            freePlaces++;
        } else if (car == place2B) {
            place2B = null;
            freePlaces++;
        } else if (car == place2C) {
            place2C = null;
            freePlaces++;
        } else
            System.out.println("Where is no such car into parking!");
    }

    void freePlaces() {
        System.out.println("Quantity of free place = " + freePlaces);
    }

    void printMap() {
        System.out.println("--------------------------");
        System.out.printf("| %-10s| %-10s |%n", place1A == null ? "0" : place1A.getModel(), place2A == null ? "0" : place2A.getModel());
        System.out.printf("| %-10s| %-10s |%n", place1A == null ? "" : place1A.getId(), place2A == null ? "" : place2A.getId());
        System.out.println("--------------------------");
        System.out.printf("| %-10s| %-10s |%n", place1B == null ? "0" : place1B.getModel(), place2B == null ? "0" : place2B.getModel());
        System.out.printf("| %-10s| %-10s |%n", place1B == null ? "" : place1B.getId(), place2B == null ? "" : place2B.getId());
        System.out.println("--------------------------");
        System.out.printf("| %-10s| %-10s |%n", place1C == null ? "0" : place1C.getModel(), place2C == null ? "0" : place2C.getModel());
        System.out.printf("| %-10s| %-10s |%n", place1C == null ? "" : place1C.getId(), place2C == null ? "" : place2C.getId());
        System.out.println("--------------------------");
    }

}
