package main;

public class SmartPhone {
    private final String brand;
    private final int year;
    private final String model;
    private final double diagonal;
    private int memory;
    private int cores;
    private int battery;

    private SmartPhone(Builder builder) {
        brand = builder.brand;
        year = builder.year;
        model = builder.model;
        diagonal = builder.diagonal;
        memory = builder.memory;
        cores = builder.cores;
        battery = builder.battery;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", diagonal=" + diagonal +
                ", memory=" + memory +
                ", cores=" + cores +
                ", battery=" + battery +
                '}';
    }

    public static class Builder {
        private final String brand;
        private final int year;
        private final String model;
        private final double diagonal;
        private int memory = 0;
        private int cores = 0;
        private int battery = 0;


        public Builder(String brand, int year, String model, double diagonal) {
            this.brand = brand;
            this.year = year;
            this.model = model;
            this.diagonal = diagonal;
        }

        public Builder withMemory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder withCores(int value) {
            cores = value;
            return this;
        }

        public Builder withBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public SmartPhone build() {
            return new SmartPhone(this);
        }


    }
}
