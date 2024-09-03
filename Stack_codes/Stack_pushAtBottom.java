//push at bottom of stack

package Stack_codes;
import java.util.*;

public class Stack_pushAtBottom{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.push(20);
        s.push(30);
        s.push(40);

        pushAtBottom(s,10);
        printStack(s);
    }
}