package ArrayList;

import java.util.ArrayList;

public class swap {
    public static void Swapping(ArrayList<Integer> list){
        int n=list.size();
        for(int i=0;i<n/2;i++){
            Integer temp=list.get(i);
            list.set(i,list.get(n-1-i));
            list.set(n-1-i,temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        Swapping(list);
        System.out.println(list);
        reverseArrayList(list);
        System.out.println(list);
    }

    public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
