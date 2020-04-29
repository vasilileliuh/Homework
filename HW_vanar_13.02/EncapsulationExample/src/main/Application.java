package main;

public class Application {
    public static void main(String[] args) {
        Box firstBox = new Box();
        Box secondBox = new Box();

        Book book = new Book("Book", "War and Peace", 386, "Leo Tolstoi", 1824);
        Journal journal = new Journal("Journal", 75, "Formula One","Sports" );

        firstBox.setContent(book);
        secondBox.setContent(journal);

        System.out.println(firstBox.toString());
        System.out.println(secondBox.toString());

    }
}
