package app;

import main.SmartPhone;

public class Application {
    public static void main(String[] args) {
        SmartPhone firstSP = new SmartPhone.Builder("Apple", 2015, "iPhone 6S", 6.5)
                .withCores(8)
                .build();
        SmartPhone secondSP = new SmartPhone.Builder("Samsung", 2019, "S11", 8.7)
                .withBattery(5000)
                .build();
        SmartPhone thirdSP = new SmartPhone.Builder("ASUS", 2015, "Zenfone 2", 5.5)
                .withMemory(4096)
                .build();

        System.out.println(firstSP);
        System.out.println(secondSP);
        System.out.println(thirdSP);

    }
}
