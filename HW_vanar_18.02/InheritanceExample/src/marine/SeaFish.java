package marine;

public class SeaFish extends Fish implements FishInterface, Cloneable {

    // deleting public access modifier to close access to constructor
    SeaFish(String type, Integer weight, String environment) {
        super(type, weight, environment);
    }

    @Override
    public String toString() {
        return "SeaFish [getType()=" + getType() + ", getWeight()=" + getWeight() + ", getEnvironment()="
                + getEnvironment() + "]";
    }


}

