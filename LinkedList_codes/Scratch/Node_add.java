package LinkedList_codes.Scratch;

public class Node_add {
    //node
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    static int size=0;

    //methods
    public void addFirst(int data){
        // step 1. Create new Node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //step 2. newNode next= head     -- linking
        newNode.next= head;

        //step 3. newNode ko head banao
        head= newNode;
    }


    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail= newNode;
    }


    public void addMiddle(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i< idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next=newNode;
    }


    public void PrintLL(){
        if(head==null){
            System.out.print("The LL is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node_add ll= new Node_add();
        ll.PrintLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.PrintLL();

        ll.addMiddle(2, 22);
        ll.PrintLL();
        System.out.println(size);
    }
}
