package LinkedList_codes.Scratch;
public class Linked_List_all {
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
    static int size=0;


    //add the node at first 
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }


    //remove first node 
    public void removeFirstNode(){
        if(size==0){
            System.out.println("OPPS LL IS EMPTY"); 
            return;
        }else if(size==1){
            head=tail=null;
            size--;
        }else{
            head=head.next;
            size--;
        }
    }


    //removing the last node
    public void RemoveLast(){
        if(size==0){
            System.out.println("LL KHALI HAI"); 
            return;
        }else if(size==1){
            head=tail=null;
            size--;
        }else{
            Node prev= head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            prev.next=null;
            tail=prev;
            size--;
        }
    }


//Iterator Search
    public void itrSearch(int key){    //O(n)
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Key found at index "+index);
                return;
            }
            temp=temp.next;
            index++;
        }
        System.out.println("Key Not found");
    }


//Recursive Search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    } 
    public int recSearch(int key){
        return helper(head,key);
    }


// Reverse a linked list          --   3 variable, while medhe 4 steps      O(n) 
    public void Reverse(){
        Node prev=null;
        Node curr=tail=head;      // order is important
        Node next;

        while(curr != null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    //Remove  nth node from  end of LL
    public void Remove_nth_node(int n){       //Remove nth node from last  
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(n== size){           // first element hai delete krne wala then
            head=head.next;
            return;
        }

        //size-n        
        int i=1;
        int iToFind= size-n;
        Node prev= head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;            // bich wala nikal dalo 
        System.out.println(size);
        return;
    }


    //Finding the mid node of linkedlist              SLOW-FAST APPROACH
    public Node FindMid(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next != null){
            slow=slow.next;   //+1
            fast=fast.next.next;   //+2
        }
        return slow;
    }


    //Check Palindrome  with the help of FindMid function
    public Boolean checkPalindrome(){
        if(head==null || head.next == null){
            return true;
        }
        //step 1. Find middle
        Node midNode= FindMid();

        //step 2. reverse from mid to end  2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr !=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;  //right half ka head    last wala due to reverse
        Node left = head;   //left half ka head

        //step 3. check 1st half and 2nd half
        while(right.next != null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    // chwck whether the linkedlist is cyclic or not    -- Floyd's cycle finding algorithm
    public Boolean isCycle(){
        Node slow= head;
        Node fast= head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }



    //Removing the loop / cycle from the linkedlist
    public void RemoveCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle= false;

        // step 1. detect cycle
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(!cycle){
            System.out.println("Cycle not present in LL");
            return;
        }

        //step 2. find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //step 3. remove cycle   --- last.next=null
        prev.next=null;
        System.out.println("Cycle is removed from LL");
    }



    //add cycle
    public void addCycle(){
        if(isCycle()){
            System.out.println("Cycle already present");
        }else{
            Node last=head;
            while(last.next!=null){
            last=last.next;
            }
            last.next=head.next;   // attaching to head.next   means 2nd wale ko
            System.out.println("Cycle is added in your linked list");
        }
    }



    public void PrintLL(){
        if(head==null){
            System.out.println("Empty LL");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linked_List_all ll=new Linked_List_all();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.PrintLL();

        // ll.removeFirstNode();
        // ll.PrintLL();
        // System.out.println("size of ll is "+size);

        // ll.RemoveLast();
        // ll.PrintLL();
        // System.out.println("size of ll is "+size);

        ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.PrintLL();

        // ll.itrSearch(5);

        // System.out.println("key found at "+ll.recSearch(1));

        ll.Reverse();
        ll.PrintLL();
        
        ll.Remove_nth_node(6);
        ll.Remove_nth_node(2);
        ll.PrintLL();
        System.out.println(ll.checkPalindrome());
        System.out.println("The cycle is prseent "+ll.isCycle());

        ll.RemoveCycle();
        ll.addCycle();    // but from middle somewhere not attach to head
        ll.RemoveCycle();
    }
}
