//Connect the N ropes and get the minimum cost of rope
// Connect N Ropes Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost, 
//such that the cost to connect two ropes is equal to the sum of their lengths. 
// ropes = {4, 3, 2, 6)     ans = 29    connect 2 & 3 [5]     connect 5 & 4 [9]    connect 9 & 6 [15]        5+9+15=29
package Heaps_Codes;
import java.util.*;

public class n_ropesConnectMinCost {

    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Add the array element in PriorityQueue
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        //Implement the cost and logic
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost +=min+min2;
            // add "min+min2" too in priorityQueue after removing min elements
            pq.add(min+min2);
        }

        System.out.println("Total cost of connecting ropes is "+cost);

    }
}
