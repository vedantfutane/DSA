//Heap is also called as Prioriy Queue
//  add for O(logn),   remove for O(logn)   and peek for O(1)
package Heaps_Codes;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQue_JCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();    // If kuch na de tho woo priority ascending order me dega for descending order wala pr comparator reverse order ka likhna padega

        pq.add(10);
        pq.add(2222);
        pq.add(300);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

        System.out.println();

        PriorityQueue<Integer> pq1= new PriorityQueue<>(Comparator.reverseOrder());    // If kuch na de tho woo priority ascending order me dega for descending order wala pr comparator reverse order ka likhna padega

        pq1.add(10);
        pq1.add(2222);
        pq1.add(300);
        pq1.add(1);

        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }
    }
}
