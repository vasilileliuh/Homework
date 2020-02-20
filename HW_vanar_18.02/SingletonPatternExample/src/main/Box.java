package main;

public final class Box {
    private static volatile Box instance;
    private Object value;
//    внутрь класса Box могут попасть абсолютно все ссылочные объекты и примитивы в классах-обёртках

    private Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public static Box getInstance(Object value) {
        if (instance == null)
            synchronized (Box.class) {
                if (instance == null)
                    instance = new Box(value);
            }
        return instance;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
