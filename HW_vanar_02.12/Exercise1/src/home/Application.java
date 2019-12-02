package home;

public class Application {
    public static void main(String[] args) {

        System.out.println("First scenario");
        Lift.printLiftMap();
        Lift.openDoors();
        Lift.printLiftMap();
        Lift.enterPassenger(80); // kg
        Lift.enterPassenger(100); // kg
        Lift.closeDoors();
        Lift.moveToLevel(4);
        Lift.moveToLevel(1);
        Lift.printLiftMap();

        System.out.println("Second scenario");
        Lift.printLiftMap();
        Lift.openDoors();
        for (int i = 0; i < 11; i++) {
            Lift.enterPassenger(100); // kg
        }
        if (Lift.closeDoors()) {
            System.out.println("PASSENGERS: The doors are closing");
        } else {
            System.err.println("PASSENGERS: The doors are not closing!");
        }

        if (Lift.moveToLevel(3)) {
            System.out.println("PASSENGERS: The lift started moving");
        } else {
            System.out.println("PASSENGERS: The lift is not moving!");
        }

        Lift.printLiftMap();


    }
}
