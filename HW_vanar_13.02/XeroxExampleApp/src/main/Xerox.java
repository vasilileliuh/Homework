package main;

import java.util.ArrayList;
import java.util.List;

public class Xerox implements Cloneable {
    public PaperDocumentInterface copy(PaperDocumentInterface original) throws CloneNotSupportedException {
        return (PaperDocumentInterface) ((PaperDocument) original).clone();
    }

    public List<PaperDocumentInterface> copy(PaperDocumentInterface original, int quantity) throws CloneNotSupportedException {
        List<PaperDocumentInterface> list = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            list.add(copy(original));
        }
        return list;
    }

}
