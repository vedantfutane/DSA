package LinkedList_codes;
import java.util.LinkedList;

public class LinkedMain {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(4);
        ll.add(5);
        ll.add(3,3);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
