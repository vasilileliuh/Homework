package marine;

public class Fish implements FishInterface, Cloneable {
    private String type;
    private Integer weight;
    private String environment;

    Fish() {
    }

    Fish(String type, Integer weight, String environment) {
        super();
        this.type = type;
        this.weight = weight;
        this.environment = environment;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {

        return type;
    }

    @Override
    public void setWeight(Integer weight) {
        this.weight = weight;

    }

    @Override
    public Integer getWeight() {
        return weight;
    }

    @Override
    public void setEnvironment(String environment) {
        this.environment = environment;

    }

    @Override
    public String getEnvironment() {
        return environment;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    @Override
    public String toString() {
        return "Fish [type=" + type + ", weight=" + weight + ", environment=" + environment + "]";
    }
}
