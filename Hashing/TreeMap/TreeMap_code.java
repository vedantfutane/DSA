package Hashing.TreeMap;
import java.util.*;
//TreeMap give all the names in ordered format
public class TreeMap_code {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm= new TreeMap<>();
        tm.put("India", 100);
        tm.put("Malaysia", 10);
        tm.put("China", 50);
        tm.put("Africa", 20);

        System.out.println(tm);

        System.out.println(tm.get("Malaysia"));

        tm.remove("China");

        Set<String> keys= tm.keySet();
        System.out.println(keys);
        for(String k: keys){
            System.out.println(k);
        }
    }
}

