package collections;

public class SimpleList {

    private int length;
    private Box first;

    private class Box {

        int value;
        Box next;

        Box(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        Box getNext() {
            return next;
        }

        public void setNext(Box next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }

    }

    public SimpleList() {
        length = 0;
        first = null;
    }

    public int getLength() {
        return length;
    }

    public void add(int value) {
        Box current = first;
        if (length == 0) {
            first = new Box(value);
        } else {
            for (int i = 0; i < length - 1; i++) {
                current = current.next;
            }
            current.next = new Box(value);
        }
        length++;
    }

    public void print() {
        Box current = first;
        for (int i = 0; i < length; i++) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int get(int index) {
        if (index < 0 || index > length - 1)
            System.err.println("Index out of bound exception");
        else {
            Box current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getValue();
        }
        return 0;
    }
}
