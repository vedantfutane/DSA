//Maximum Subarray or Sliding Window Problem
package Deque_codes;
import java.util.*;

public class MaxSubarray_SlidingWindow {
    static void printMax(int arr[],int n, int k){
        Deque<Integer> dq=new LinkedList<Integer>();
        int i;
        for(i=0;i<k;++i){
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(;i<n;++i){
            System.out.print(arr[dq.peek()]+" ");
            while((!dq.isEmpty()) && dq.peek()<=i-k){
                dq.removeFirst();
            }
            while((!dq.isEmpty()) && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        printMax(arr, arr.length, k);
    }
}
