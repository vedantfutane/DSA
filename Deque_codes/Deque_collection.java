package Deque_codes;
import java.util.*;

public class Deque_collection {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>();
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(3);
        dq.addLast(4);
        dq.add(5);  // it will act like addLast
        System.out.print(dq);

        dq.removeFirst();
        dq.removeLast();
        dq.remove();  // this will behave as removeFirst
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.getClass());
        System.out.println(dq.peek());   // this will behave as getFirst
    }
}
