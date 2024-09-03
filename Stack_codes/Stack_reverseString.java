package Stack_codes;
import java.util.Stack;

public class Stack_reverseString {
    public static String reverseStringChar(Stack<Character> s, String str){

        int index=0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String result= reverseStringChar(s, "vedant");
        System.out.println(result);
        
    }
}
