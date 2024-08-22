package LinkedList_codes;
// merge sort,   zigzag pn kelay
public class MergeSort {
    public static class Node{ 
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    // Add the node at the beginning 
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    private Node findMid(Node head){
        Node slow = head;
        Node fast = head.next; // Start fast one step ahead for accurate mid calculation

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node h1, Node h2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }

        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }

        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }

        return mergedLL.next;  // Skip the initial dummy node
    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        // Find mid
        Node mid = findMid(head);

        // Split the list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge sorted halves
        return merge(newLeft, newRight);
    }

    public void printList(){
        Node temp = head;
        if (head == null) {
            System.out.println("Empty LL");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? "->" : ""));
            temp = temp.next;
        }
        System.out.println();
    }



    public void ZigZagLL(Node head){
        if(head==null || head.next == null){
            return;
        }

        //find mid
        Node mid=findMid(head);

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;     // after this last execution curr and temp will be null --- check dry run
        }

        //alt merge -zizzag pattern me
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }   
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        ll.addFirst(6);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(0);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(3);

        System.out.println("Original List:");
        ll.printList();
        
        ll.head = ll.mergeSort(ll.head);
        
        System.out.println("Sorted List:");
        ll.printList();

        //zigzag
        ll.ZigZagLL(ll.head);
        ll.printList();


    }
}
