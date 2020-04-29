package main;

public class Journal implements ThingInterface {
    private String name;
    private Integer pages;
    private String title;
    private String category;

    public Journal(){}

    public Journal(String name, Integer pages, String title, String category) {
        this.name = name;
        this.pages = pages;
        this.title = title;
        this.category = category;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
