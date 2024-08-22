package Stack_codes;
import java.util.ArrayList;

public class Stack_arrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();

        public boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty"); 
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
