package Task1;

public class DoubleLinkedlist {
    protected Node head;

    public DoubleLinkedlist() {
        this.head = null;
    }


    public void add(int value) {
        Node newNode = new Node(value, null, null);

        if (head == null) {
            this.head = newNode;
        } else {
            Node pointer = FindLast();
            pointer.setNext(newNode);
            newNode.setPrev(pointer);
        }
    }

    private Node FindLast() {
        Node pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        return pointer;
    }

    public void print(){
        Node pointer = head;
        System.out.print("| ");
        while (pointer !=null){
            System.out.print(pointer.getValue()+" ");
            pointer = pointer.getNext();
        }
        System.out.println("|");
    }


    public void remove() {
        Node pointer = FindLast();
        if (pointer == head) {
            head = null;
        } else {
            pointer.getPrev().setNext(null);
            pointer = null;
        }
    }


    public int count() {
        int res;
        Node pointer = head;
        if (pointer == null) {
            return 0;
        } else {
            res = 1;
        }
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
            res++;
        }
        return res;
    }


    public int pop() {
        if(head == null){
            return -1;
        }
        int res = head.getValue();
        head = head.getNext();
        head.getPrev().setNext(null);
        head.setPrev(null);
        return res;
    }


    public Node get() {
        return FindLast();
    }

    public int getValue() {
        return get().getValue();
    }
}
