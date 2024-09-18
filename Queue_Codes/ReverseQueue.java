package Queue_Codes;
import java.util.*;


public class ReverseQueue {
    public static void queueReverse(Queue<Integer> original){
        Stack<Integer> s=new Stack<>();
        while(!original.isEmpty()){
            s.push(original.peek());     //do line me likhne se accha direct ek me original.remove() kiya tho bhi chalegA
            original.remove();
        }
        
        Queue<Integer> revQueue=new LinkedList<>();
        while(!s.isEmpty()){
            revQueue.add(s.peek());      //YAHA PR BHI EK ME HO SKTA 
            s.pop();
        }
        
        while(!revQueue.isEmpty()){
            System.out.print(revQueue.remove()+"  ");  // iske jaisse
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        queueReverse(q);

    }
}
