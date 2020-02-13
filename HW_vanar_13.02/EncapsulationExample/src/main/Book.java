package main;

public class Book implements ThingInterface {
    private String name;
    private String title;
    private Integer pages;
    private String authorName;
    private Integer publishingYear;

    public Book() {
    }

    public Book(String name, String title, Integer pages, String authorName, Integer publishingYear) {
        if (title != null)
            this.name = name;
        if (title != null)
            this.title = title;
        if (pages > 0)
            this.pages = pages;
        if (title != null)
            this.authorName = authorName;
        if (publishingYear > 0)
            this.publishingYear = publishingYear;

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
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
