package main;

public class PaperDocument implements PaperDocumentInterface, Cloneable {
    private String type;
    private String title;
    private String content;

    public PaperDocument(String type, String title, String content) {
        this.type = type;
        this.title = title;
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "PaperDocument{" +
                "type='" + type + "\'" +
                "title='" + title + "\'" +
                "content='" + content + "\'}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PaperDocumentInterface paper = (PaperDocumentInterface) super.clone();
        paper.setTitle(this.title);
        paper.setType(this.type);
        paper.setContent(this.content);
        return paper;
    }
}
