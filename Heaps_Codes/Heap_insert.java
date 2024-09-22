// Insert data in heap using ArrayList with O(logn) time complexity
package Heaps_Codes;
import java.util.*;

public class Heap_insert {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){     //O(logn)
            arr.add(data);
            int child= arr.size()-1 ;  // For child
            int parent=(child-1)/2 ;   // For Parent

            while(arr.get(child) < arr.get(parent)){         //yaha pr sign chage karo reverse hoga
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                // Move up the tree
                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public int peek(){          // O(1)
            return arr.get(0);
        }

        private void heapify(int i){
            int left=(2*i)+1;
            int right=(2*i)+2;
            int minIdx=i;

            if(left< arr.size() && arr.get(minIdx)>arr.get(left)){     //yaha pr sign chage karo reverse hoga
                minIdx=left;
            }

            if(right< arr.size() && arr.get(minIdx)>arr.get(right)){    //yaha pr sign chage karo reverse hoga
                minIdx=right;
            }

            if(minIdx != i){
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }

        public int delete(){
            int data=arr.get(0);

            //step 1. swap first and last
            int temp= arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step 2. delete first
            arr.remove(arr.size()-1);

            //step 3. heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }


    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(4);
        h.add(3);
        h.add(10);
        h.add(1);
        h.add(7);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.delete();
        }
    }
}
