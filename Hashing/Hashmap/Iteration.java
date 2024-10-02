package Hashing.Hashmap;
import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("A",100);
        hm.put("B",200);
        hm.put("C",700);
        hm.put("D",600);
        hm.put("E",100);

        HashMap<String, Integer> hmm= new HashMap<>();
        hmm.putAll(hm);

        //Iteration using keySet()---- keys 
        Set<String> keys=hmm.keySet();    // in keys all keys are store in one set
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key = "+k+", Value = "+hmm.get(k));
        }

        //Iteration using entrySet()---- pairs
        System.out.println("The set is: " + hmm.entrySet()); 
        
    }
}
