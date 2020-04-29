package building;

public class Office {
    public static final int TOP = 0;
    public static final int MIDDLE = 1;
    public static final int BOTTOM = 2;

    private static Object[] cabinet = {
            null,
            null,
            null
    };

    public static void printCabinet() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 31; j++) {
                if (i == 0 || i == 2 || i == 4 || i == 6)
                    System.out.print("#");
                else if (j == 0 || j == 30) {
                    System.out.print("#");
                } else if (i == 1 && j == 1 && cabinet[TOP] != null) {
                    System.out.printf(" %-28s", cabinet[TOP]);
                } else if (i == 1 && j > 1 && cabinet[TOP] != null)
                    System.out.print("");
                else if (i == 3 && j == 1 && cabinet[MIDDLE] != null) {
                    System.out.printf(" %-28s", cabinet[MIDDLE]);
                } else if (i == 3 && j > 1 && cabinet[MIDDLE] != null)
                    System.out.print("");
                else if (i == 5 && j == 1 && cabinet[BOTTOM] != null) {
                    System.out.printf(" %-28s", cabinet[BOTTOM]);
                } else if (i == 5 && j > 1 && cabinet[BOTTOM] != null)
                    System.out.print("");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean putThingOnShelf(int shelf, Object thing) {
        if (shelf >= 0 && shelf < 3 && thing != null) {
            if (cabinet[shelf] == null) {
                cabinet[shelf] = thing;
                return true;
            } else
                return false;
        } else
            System.err.println("Cabinet out of shell exception!");
        return false;
    }

    public static boolean removeThingFromShelf(int shelf) {
        if (shelf >= 0 && shelf < 3) {
            cabinet[shelf] = null;
            return true;
        } else
            System.err.println("Cabinet out of shell exception!");
        return false;
    }
}
