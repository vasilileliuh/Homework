package marine;

public class FishFactory {

    public FishFactory() {

    }

    public Fish getFish(String Fish, String type, Integer weight, String environment) {
        if (Fish == null) {
            return null;
        }
        if (Fish.equalsIgnoreCase("SeaFish")) {
            return new SeaFish(type, weight, environment);
        } else if (Fish.equalsIgnoreCase("RiverFish")) {
            return new RiverFish(type, weight, environment);
        }

        return null;
    }

    public FishInterface cloneFish(FishInterface fish) throws CloneNotSupportedException {
        if (fish == null) {
            return null;
        }
        if (fish instanceof SeaFish) {
            return (FishInterface) ((SeaFish) fish).clone();
        } else if (fish instanceof RiverFish) {
            return (FishInterface) ((RiverFish) fish).clone();
        }
        return null;
    }

    @Override
    public String toString() {
        return "FishFactory [getClass()=" + getClass() + "]";
    }
}
