package ArrayList;

import java.util.ArrayList;

public class Maxnum{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(52);
        list.add(3);

        //o(n)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }

            max=Math.max(max,list.get(i));
        }
        System.out.println("The max num is "+max);
    }
}
