package ArrayList;
import java.util.*;
//Find if any pair in a Sorted ArrayList has a Target sum.
public class PairSum1 {
    //Brute Force Approach      O(n^2)
    // public static Boolean TargetSum(ArrayList<Integer> list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    ////Two Pointers approach                O(n)
    public static Boolean FindTargetSum(ArrayList<Integer> list, int target){
        int lp=0, rp=list.size()-1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{              //list.get(lp)+list.get(rp)>target
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(10);

        int target=11;
        // System.out.println(TargetSum(list, target));
        System.out.println(FindTargetSum(list,target));

    }
}
