package ArrayList;
import java.util.*;
public class Multidim_arraylist {
    public static void main(String[] args) {
        //concept
        // ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();

        // ArrayList<Integer> list1= new ArrayList<>();
        // list1.add(1); list1.add(2);
        // mainList.add(list1);

        // ArrayList<Integer> list2= new ArrayList<>();
        // list2.add(3); list2.add(4);
        // mainList.add(list2);

        // System.out.println(mainList);
        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> curList= mainList.get(i);
        //     for(int j=0;j<curList.size();j++){
        //         System.out.print(curList.get(j)+" ");
        //     }
        // }

        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i * 2);
            list2.add(i * 5);
            list3.add(i * 10);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curList= mainList.get(i);
            for(int j=0;j<curList.size();j++){
                System.out.print(curList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
