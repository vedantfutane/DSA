package Hashing.LinkedHashMap;
import java.util.*;
// Main thing about LinkedHashMap is that its insertion is Ordered and implementation is with help of doubly LinkedList
// rest all things same as HashMap
public class LinkedHashMap_Code {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm= new LinkedHashMap<>();
        lhm.put("India", 600);
        lhm.put("America",200);
        lhm.put("Nepal",300);

        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 600);
        hm.put("America",200);
        hm.put("Nepal",300);

        System.out.println("HashMap : "+hm);    // unordered
        System.out.println("LinkedHashMap : "+lhm);    //ordered

    }
}
