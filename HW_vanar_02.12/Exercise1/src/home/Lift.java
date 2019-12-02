package home;

class Lift {
    // Lift's memory
    private final static double MAX_WEIGHT_KG = 1000.0;
    private final static byte MAX_LEVEL = 11;
    private final static byte MIN_LEVEL = 0;
    private static boolean isOperational = true;
    private static boolean isMoving = false;
    private static boolean isClosed = true;
    private static byte level = 0;
    private static double weight = 0;
    private static boolean movingDirectionUp = false;
    private static boolean movingDirectionDown = false;

    static byte getLevel() {
        return level;
    }

    static boolean isOperational() {
        return isOperational;
    }

    static boolean isMoving() {
        return isMoving;
    }

    static boolean isClosed() {
        return isClosed;
    }

    private static void setLevel(int level) {
        if (level < MIN_LEVEL || level > MAX_LEVEL) {
            System.err.println("Level value out of bounds!");
            return;
        }
        Lift.level = (byte) level;
    }

    private static void isMoving(boolean value) {
        if (value && weight >= MAX_WEIGHT_KG) {
            System.err.println("Weight value out of bounds!");
            return;
        }
        isMoving = value;
    }

    static void printLiftMap() {
        for (int i = 11; i >= 0; i--) {
            if (i == 11)
                System.out.printf("%2s  |", "T");
            else if (i == 0)
                System.out.printf("%2s  |", "P");
            else
                System.out.printf("%2d  |", i);
            for (int j = 0; j < 7; j++) {
                if (level == i && isClosed && isOperational && j == 2)
                    System.out.print("]");
                else if (level == i && isClosed && isOperational && j == 4)
                    System.out.print("[");
                else if (level == i && !isClosed && isOperational && j == 2)
                    System.out.print("[");
                else if (level == i && !isClosed && isOperational && j == 4)
                    System.out.print("]");
                else if (level == i && isClosed && !isOperational && j == 2)
                    System.out.print("]");
                else if (level == i && isClosed && !isOperational && j == 3)
                    System.out.print("X");
                else if (level == i && isClosed && !isOperational && j == 4)
                    System.out.print("[");
                else if (level - 1 == i && isMoving && j == 3 && movingDirectionDown)
                    System.out.print("\u02C5");
                else if (level + 1 == i && isMoving && j == 3 && movingDirectionUp)
                    System.out.print("\u005E");

                else
                    System.out.print(" ");


            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
    }

    public static boolean openDoors() {
        if (isOperational && !isMoving)
            isClosed = false;
        return isOperational && !isMoving;
    }

    public static boolean closeDoors() {
        if (isOperational && !isMoving && weight <= MAX_WEIGHT_KG)
            isClosed = true;
        return isOperational && !isMoving && weight <= MAX_WEIGHT_KG;
    }

    public static void enterPassenger(double passengerWeight) {
        weight += passengerWeight;
    }

    public static void exitPassenger(double passengerWeight) {
        weight -= passengerWeight;
    }

    private static boolean moveOneLevelUp() {
        level++;
        return level < MAX_LEVEL;
    }

    private static boolean moveOneLevelDown() {
        level--;
        return level > MIN_LEVEL;
    }

    private static int compareLevel(int level) {
        if (Lift.level == level)
            return 0;
        else if (Lift.level >= level)
            return 1;
        else
            return -1;
    }

    public static boolean moveToLevel(int level) {
        isMoving = true;
        int liftLevel = Lift.level;
        switch (compareLevel(level)) {
            case -1:
                if (isOperational && isClosed)
                    for (int i = 0; i < level - liftLevel; i++) {
                        movingDirectionUp = i != level - liftLevel - 1;
                        moveOneLevelUp();
                        printLiftMap();

                    }
                isMoving = false;
                break;
            case 1:
                if (isOperational && isClosed)
                    for (int i = 0; i < liftLevel - level; i++) {
                        movingDirectionDown = i != liftLevel - level - 1;
                        moveOneLevelDown();
                        printLiftMap();

                    }
                isMoving = false;
                break;
            case 0:
                isMoving = false;
                break;
        }
        return isMoving;
    }

}
