package Deque_codes;
import java.util.*;

public class Stack_using_deque {
    static class Stack{
        Deque<Integer> dq=new LinkedList<>();
        public void push(int data){
            dq.addLast(data);  // this will add the new data at last like stack
        }

        public int pop(){
            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek "+ s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
