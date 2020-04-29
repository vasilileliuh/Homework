package main;

import java.util.List;

public class ApplicationExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        PaperDocument document = new PaperDocument("Contract", "Java Developer Hiring Contract", "\n1. Working hours per day: 6\n2. Earn per hour: 15EUR\n3. Holidays per year: 30days.");
        Xerox xerox = new Xerox();

        PaperDocument copy = (PaperDocument) xerox.copy(document);
        copy.setType("Contract Copy");

        List<PaperDocumentInterface> listOfThreeCopies = xerox.copy(copy, 3);

        for (PaperDocumentInterface paperDocument : listOfThreeCopies) {
            paperDocument.setType("Archived Contract Copy");
        }

        System.out.println(document + "\n");
        System.out.println(copy + "\n");

        for (PaperDocumentInterface paperDocument : listOfThreeCopies) {
            System.out.println(paperDocument);
        }

    }
}
