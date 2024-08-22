package ArrayList;
import java.util.*;
//Find if any pair in a "Rotated Sorted ArrayList" has a Target sum.
//O(n)
public class PairSum2 {
    public static Boolean FindPairSumTarget(ArrayList<Integer> list,int target){
        int pivot=-1;
        int n=list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                pivot=i;
                break;
            }
        }
        int lp=pivot+1;   //smallest element
        int rp=pivot;     // largest element
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;               // lp ko badhana hai with modulo arithemetic  due to rotated arraylist
            }else{
                rp=(n+rp-1)%n;             // lp ko badhana hai with modulo arithemetic due to rotataed arraylist 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(10);

        int target=21;
        System.out.println(FindPairSumTarget(list, target));
        
    }
}
