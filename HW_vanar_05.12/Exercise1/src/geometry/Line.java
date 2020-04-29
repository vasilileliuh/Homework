package geometry;

public class Line {

    private int startX;
    private int endX;
    private int startY;
    private int endY;

    public Line(int startX, int startY, int endX, int endY) {
        if (startX == endX && startY == endY)
            System.err.println("Line coordinates error");
        else {
            this.startX = startX;
            this.endX = endX;
            this.startY = startY;
            this.endY = endY;
        }
    }

    public void printCoords() {
        System.out.printf("[%d:%d]----->[%d:%d]%n", startX, startY, endX, endY);
    }

    public int length() {
        return (int) Math.round(Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2)));
    }
}
