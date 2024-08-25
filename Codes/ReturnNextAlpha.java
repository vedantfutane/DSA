package Codes;

public class ReturnNextAlpha {
    public static void main(String[] args) {
        char ch='a';
        
        if(ch=='z'){
            System.out.println("a");
        }else{
            System.out.println(ch++);
        }
    }
}
