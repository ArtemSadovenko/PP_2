package Task1;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IterableDoubleQueue queue = new IterableDoubleQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.remove();

        System.out.println(queue.pop());

        queue.print();

        for (Integer a : queue) {
            System.out.print(a);
        }

    }
}
