package andbr.gen.lilo;

public class LILO<T> {
    private Node<T> top;
    private Node<T> bottom;
    private int size;

    public LILO() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push(T newValue){
        Node newNode = new Node();
        newNode.setValue(newValue);
        if(top == null){
            top = newNode;
            bottom = newNode;
        }else{
            top.setNext(newNode);
            top = newNode;
        }
        size++;
    }

    public T pop(){
        if(bottom == null){
            return null;
        }else{
            T helper = bottom.getValue();
            if(bottom == top){
                bottom = null;
                top = null;
            }else{
                bottom = bottom.getNext();
            }
            size--;
            return helper;
        }

    }
}
