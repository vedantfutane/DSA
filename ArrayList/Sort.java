package ArrayList;
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(32,5,7,3,1,3));
        System.out.println(list);

        Collections.sort(list);    //ascending
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());   //descending  //with list we added Comparator for logic how we need
        System.out.println(list);

    }
    
}
