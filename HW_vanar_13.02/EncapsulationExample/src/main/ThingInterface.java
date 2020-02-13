package main;

public interface ThingInterface {

    /**
     * 1 ...
     * Интерфейс говорит о том, что любая вещь(класс), которая будет имплиментировать этот интерфейс, будет иметь минимум два метода(setName и getName) и одно поле String.
     * Другими словами, к этому полю name будет организован доступ извне капсулы
     */
    void setName(String name);

    String getName();
}
