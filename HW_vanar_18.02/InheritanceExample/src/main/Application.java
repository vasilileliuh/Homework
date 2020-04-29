package main;

import marine.FishFactory;
import marine.FishInterface;
import marine.RiverFish;
import marine.SeaFish;


@SuppressWarnings("all")
public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {
//		FishInterface seaFish = new SeaFish("Biban",5,"Black Sea");
//			System.out.println(seaFish);
//			FishInterface  newSeaFish = (FishInterface)((SeaFish) seaFish).clone();
//			System.out.println(newSeaFish);
//
//			System.out.println(seaFish.equals(newSeaFish));
//
//			FishInterface riverFish = new RiverFish("Carp",2,"River Prut");
//			System.out.println(riverFish);
//			FishInterface  newRiverFish = (FishInterface)((RiverFish) riverFish).clone();
//			System.out.println(newRiverFish);
//
//			System.out.println(riverFish.equals(newRiverFish));

        FishFactory ff = new FishFactory();

        FishInterface fI = ff.getFish("RiverFish", "Carp", 2, "River Prut");
        FishInterface cloneArmy = ff.cloneFish(fI);
        cloneArmy.setWeight(55);

        System.out.println("Cloned fish= " + cloneArmy + "\n");
        System.out.println(ff.getFish("RiverFish", "Carp", 2, "River Prut"));
        System.out.println(ff.getFish("SeaFish", "Biban", 5, "Black Sea"));
    }

}


