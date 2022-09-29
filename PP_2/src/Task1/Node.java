package Task1;

public class Node {
    protected int value;
    protected Node next;
    protected Node prev;

    public Node(){
        this.next = null;
        this.prev = null;
    }

    public Node(int value){
        this.next = null;
        this.prev = null;
        this.value = value;
    }

    public Node(int value, Node next, Node prev){
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Node(Node next, Node prev){
        this.next = next;
        this.prev = prev;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
