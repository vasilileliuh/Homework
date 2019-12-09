package collections;

public class SimplePositiveQueue {
    private int length;
    private int first;
    private int middle;
    private int last;

    public SimplePositiveQueue() {
        length = 0;
        first = -1;
        middle = -1;
        last = -1;
    }

    public int getLength() {
        return length;
    }

    public boolean push(int value) {
        if (value <= 0)
            System.err.println("Positive value only!");
        else if (first == -1) {
            first = value;
            length++;
        } else if (middle == -1) {
            middle = value;
            length++;
        } else if (last == -1) {
            last = value;
            length++;
        }
        return first == -1 || middle == -1 || last == -1;
    }

    public int poll() {
        if (first == -1)
            return first;
        else {
            int temp = first;
            first = middle;
            middle = last;
            last = -1;
            length--;
            return temp;
        }
    }
}
