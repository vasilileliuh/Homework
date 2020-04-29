package marine;

public class RiverFish extends Fish {

    RiverFish(String type, Integer weight, String environment) {
        super(type, weight, environment);
    }

    @Override
    public String toString() {
        return "RiverFish [getType()=" + getType() + ", getWeight()=" + getWeight() + ", getEnvironment()="
                + getEnvironment() + "]";
    }


}

