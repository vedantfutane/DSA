package Hashing.Hashmap;
import java.util.*;

public class ImplementHashMap {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[N];
            for(int i=0;i<N;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc=key.hashCode();         // hashCode()  function for getting the hash code for the key
            return Math.abs(hc) % N;     // return absolute value of hash code and %size limit it to size of bucket
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll= buckets[bi];
            int di=0;

            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;  
        }

        @SuppressWarnings("unchecked")
        private void reHash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];    // nayi bucket bana li double size ki
            N=N*2;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();   // khali ll dal diye sarre index pr
            }

            //nodes -> add in bucket
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){        // O(lambda)  -> O(1)
            int bi=hashFunction(key);         // bucketindex bi  where the LinkedList is stored
            int di=searchInLL(key, bi);           // dataindex di where the data is stored

            if(di!= -1){
                Node node=buckets[bi].get(di);   // bucket ke bi pr jaa kr uske ll ke di ko liya dala node me
                node.value=value;         //update
            }else{  
                buckets[bi].add(new Node(key, value));    // if woo nhi mila then uss bi pr ja kr new node add kr dega
                n++;
            }

            double lambda= (double)n/N;
            double threshold=2.0;
            if(lambda>threshold){
                reHash();
            }
        }

        public boolean containsKey(K key){         // O(1)
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);

            if(di!= -1){
                return true;     // valid
            }else{
                return false;    // not valid menas not present -1
            }
        }

        public V get(K key){                     // O(1)
            int bi=hashFunction(key);         
            int di=searchInLL(key, bi);         

            if(di!= -1){
                Node node=buckets[bi].get(di);
                return node.value;
            }else{  
                return null;
            }
        }

        public V remove(K key){                 // O(1)
            int bi=hashFunction(key);         
            int di=searchInLL(key, bi);         

            if(di!= -1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }else{  
                return null;
            }
        }


        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }


        public boolean isEmpty(){
            return n==0;
        }

    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("A",100);
        hm.put("B",1000);
        hm.put("C",200);

        ArrayList<String> keys=hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println(hm.get("A"));
        System.out.println(hm.remove("A"));
        System.out.println(hm.get("A"));
    }
}
