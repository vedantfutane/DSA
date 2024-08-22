package LinkedList_codes.Scratch;

public class Linked_List {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Linked_List ll=new Linked_List();

        //prefer methods
        // ll.head= new Node(1);
        // ll.head.next= new Node(2);

    }
}
