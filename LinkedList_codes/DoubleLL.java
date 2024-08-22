package LinkedList_codes;

public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;
    
    //add first
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    ///Print
    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

        //ye prev wala dikhne ke liye ulta kr ke dekhna hoo jayega
        // Node temp=tail;
        // while(temp!=null){
        //     System.out.print(temp.data+"->");
        //     temp=temp.prev;
        // }
        // System.out.println("null");
    }

    //remove
    public void removeFirst(){
        if(head==null){
            System.out.println("LL is already empty");
            return;
        } 
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }


    //Reverse              3 variable  and while me 5 steps
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node aggee;
        while(curr!=null){
            aggee=curr.next;
            curr.next=prev;
            curr.prev=aggee;

            prev=curr;
            curr=aggee;
        }
        head=prev;
    }
    
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addFirst(40);
        dll.printLL();
        System.out.println(dll.size);
        
        dll.removeFirst();
        dll.printLL();
        System.out.println(dll.size);
        
        dll.reverse();
        dll.printLL();

    }
}
