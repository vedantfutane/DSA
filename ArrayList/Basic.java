package ArrayList;
import java.util.ArrayList;
public class Basic {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("hii");
        l.add("bye beta");
        System.out.println(l);
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);            //o(1)
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println(list.get(2));   //o(1)

        list.add(2,10);           //o(n)
        System.out.println(list);

        list.set(1,4);              //o(n)
        System.out.println(list.get(1));

        list.remove(3);                    //o(n)
        list.remove(3);
        System.out.println(list);

        System.out.println(list.contains(10));             //o(n)
        System.out.println(list.contains(11));


        int n=list.size();                        //o(n)     also it gives actual size
        System.out.println(n);

        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
