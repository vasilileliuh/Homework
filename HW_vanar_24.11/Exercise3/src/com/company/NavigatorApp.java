package com.company;

public class NavigatorApp {

    public static void main(String[] args) {

        printMap(15, 25, 8, 14, 5, 4);
    }

    private static void printMap(int horizontalSize, int verticalSize, int observerXCoordinate, int observerYCoordinate,
                                 int buildingXCoordinate, int buildingYCoordinate) {
        int mediumHValue = horizontalSize / 2;
        int mediumVValue = (verticalSize + 4) / 2;
        for (int i = 1; i <= verticalSize + 5; i++) {
            if (i == 1) {
                System.out.printf("%4s", "");
                for (int j = 1; j <= horizontalSize; j++) {
                    System.out.print("   ");
                    if (j == mediumHValue) {
                        System.out.print(" N ");
                    }
                }
                System.out.println();
            } else if (i == 2) {
                System.out.printf("%4s", "");
                for (int j = 1; j <= horizontalSize; j++) {
                    System.out.print("   ");
                    if (j == mediumHValue) {
                        System.out.print(" ^ ");
                    }
                }
                System.out.println();
            } else if (i == 3) {
                System.out.printf("%8s", "");
                for (int j = 1; j <= horizontalSize; j++) {
                    System.out.printf("%-3d", j);
                }
                System.out.println();
            }
            if (i >= 3 && i <= verticalSize + 2) {
                if (i == mediumVValue) {
                    System.out.print("W < ");
                } else
                    System.out.printf("%4s", "");
                System.out.printf("%-4d", i - 2);
                for (int j = 1; j <= horizontalSize; j++) {
                    if (i <= verticalSize + 2)
                        if (j == observerXCoordinate && i == observerYCoordinate + 2)
                            System.out.print("O  ");
                        else if (j == buildingXCoordinate && i == buildingYCoordinate + 2)
                            System.out.print("C  ");
                        else
                            System.out.print(".  ");
                }
                if (i == mediumVValue)
                    System.out.print(" > E");
            }

            if (i == verticalSize + 3) {
                System.out.printf("%4s", "");
                for (int j = 1; j <= horizontalSize; j++) {
                    System.out.print("   ");
                    if (j == mediumHValue)
                        System.out.print(" \u02C5 ");
                }
            }

            if (i == verticalSize + 4) {
                System.out.printf("%4s", "");
                for (int j = 1; j <= horizontalSize; j++) {
                    System.out.print("   ");
                    if (j == mediumHValue) {
                        System.out.print(" S ");
                    }
                }
                System.out.println();
            }


            if (i >= 3 && i <= verticalSize + 3)
                System.out.println();
        }

        System.out.println();
        printViewDirection(observerXCoordinate, observerYCoordinate, buildingXCoordinate, buildingYCoordinate);
        System.out.println("Area = " + printMapArea(horizontalSize, verticalSize) + " sq.m.");
        printDistanceToObject(observerXCoordinate, observerYCoordinate, buildingXCoordinate, buildingYCoordinate);
    }

    private static int printMapArea(int horizontalSize, int verticalSize) {
        return horizontalSize * verticalSize;
    }

    private static void printViewDirection(int observerXCoordinate, int observerYCoordinate,
                                           int buildingXCoordinate, int buildingYCoordinate) {
        String direction = "outside of the building";
        if (observerYCoordinate == buildingYCoordinate && observerXCoordinate < buildingXCoordinate)
            direction = "East";
        if (observerYCoordinate == buildingYCoordinate && observerXCoordinate > buildingXCoordinate)
            direction = "West";
        if (observerYCoordinate < buildingYCoordinate && observerXCoordinate == buildingXCoordinate)
            direction = "South";
        if (observerYCoordinate > buildingYCoordinate && observerXCoordinate == buildingXCoordinate)
            direction = "North";
        if (observerYCoordinate > buildingYCoordinate && observerXCoordinate < buildingXCoordinate)
            direction = "North-East";
        if (observerYCoordinate < buildingYCoordinate && observerXCoordinate < buildingXCoordinate)
            direction = "South-East";
        if (observerYCoordinate > buildingYCoordinate && observerXCoordinate > buildingXCoordinate)
            direction = "North-West";
        if (observerYCoordinate < buildingYCoordinate && observerXCoordinate > buildingXCoordinate)
            direction = "South-West";

        System.out.println("View direction to the building: " + direction);
    }

    private static void printDistanceToObject(int observerXCoordinate, int observerYCoordinate,
                                              int buildingXCoordinate, int buildingYCoordinate) {
        double distance = Math.sqrt(Math.pow(observerXCoordinate - buildingXCoordinate, 2) +
                Math.pow(observerYCoordinate - buildingYCoordinate, 2));
        System.out.printf("Distance between observer and the building is %.2f m", distance);

    }
}

