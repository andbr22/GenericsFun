package andbr.gen.lifo;

public class LIFO<T> {
    private Node<T> top;
    private int size;

    public LIFO() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push (T newValue){
        Node newTop = new Node();
        newTop.setValue(newValue);
        newTop.setPrev(this.top);
        top = newTop;
        size++;
    }

    public T pop(){
        if(top == null){
            return null;
        }else{
            T result = top.getValue();
            top = top.getPrev();
            size--;
            return result;
        }
    }
}
