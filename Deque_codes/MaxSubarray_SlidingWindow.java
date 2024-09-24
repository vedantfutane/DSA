//Maximum Subarray or Sliding Window Problem
package Deque_codes;
import java.util.*;

public class MaxSubarray_SlidingWindow {

    //Metjod 1  -- same concept
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


    //Method 2 ---  same concept
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int res[] =new int[nums.length-k+1];
        int j=0;
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(dq.getFirst()+k==i){
                dq.removeFirst();
            }
            if(i>=k-1){
                res[j++]=nums[dq.getFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        
        printMax(arr, arr.length, k);

        int []ar=maxSlidingWindow(arr, k);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
