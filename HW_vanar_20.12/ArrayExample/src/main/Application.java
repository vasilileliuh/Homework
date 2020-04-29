package main;

import building.Office;

import static building.Office.*;

public class Application {

    public static void main(String[] args) {

        putThingOnShelf(TOP, "ordinaryBook");
        putThingOnShelf(MIDDLE, "shortBook");
        putThingOnShelf(BOTTOM, "longestBook");
        printCabinet();
        System.out.println("\n");
        removeThingFromShelf(TOP);
        removeThingFromShelf(BOTTOM);
        printCabinet();
        System.out.println("Can I put a thing on the occupied second shelf? = " + putThingOnShelf(MIDDLE, "Book"));
        removeThingFromShelf(5);
    }
}
