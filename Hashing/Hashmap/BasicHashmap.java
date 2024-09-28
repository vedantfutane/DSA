package Hashing.Hashmap;
import java.util.HashMap;

public class BasicHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();

        //put  --    O(1)
        hm.put("India",200);
        hm.put("China",400);
        hm.put("Russia",110);
        hm.put("USA",800);

        System.out.println(hm);
        
        //get    --    O(1)
        int IncomeIndia= hm.get("India");
        System.out.println(IncomeIndia);

        //containsKey    --    O(1)
        System.out.println(hm.containsKey("India"));  // true
        System.out.println(hm.containsKey("Bhutan"));  //False

        //remove    --    O(1)
        System.out.println(hm.remove("USA"));   // remove and return the value of key which is removed

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
    }
}
