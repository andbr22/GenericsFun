package andbr.gen.lifo;

public class Node<T> {
    private Node prev;
    private T value;

    public Node() {
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
