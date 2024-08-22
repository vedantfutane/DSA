package ArrayList;
import java.util.*;

public class Container_storewater {

    //Brute force approach       O(n^2)
    // public static int StoreWater(ArrayList<Integer> bound){
    //     int max=0;
    //     for(int i=0;i<bound.size();i++){
    //         for(int j=i+1;j<bound.size();j++){
    //             int height= Math.min(bound.get(i),bound.get(j));
    //             int width= j-i;
    //             int currentwater= height*width;
    //             max= Math.max(max,currentwater);
    //         }
    //     }
    //     return max;
    // }


    //Optimized two pointers approach      O(n)
    public static int OptimizedStoreWater(ArrayList<Integer> bound){
        int max=0;
        int lb=0;
        int rb=bound.size()-1;
        while(lb<rb){
            //cal water area
            int height=Math.min(bound.get(lb),bound.get(rb));
            int width=rb-lb;
            int currentwater=height*width;
            max=Math.max(max, currentwater);

            //update the pointers             chota wala hee update hoga bcz ussi pr depend krta hai area
            if(bound.get(lb)<bound.get(rb)){lb++;}else{rb--;}
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> bound= new ArrayList<>();
        bound.add(1);
        bound.add(8);
        bound.add(6);
        bound.add(2);
        bound.add(5);
        bound.add(4);
        bound.add(8);
        bound.add(3);
        bound.add(7);

        // int container_size=StoreWater(bound);
        int container_size=OptimizedStoreWater(bound);
        System.out.println("Maximum size will be "+container_size);
    }
}
