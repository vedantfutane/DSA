package Codes;

public class Plaindrome {
    public static int checkPalindrome(int n){
        int result=0;
        while(n>0){
            int lastdig=n%10;
            result=result*10+lastdig;
            n/=10;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n=123;
        if(checkPalindrome(n)==n){
            System.out.println(n+" Number is palindrome");
        }else{
            System.out.println(n+" Number is not palindrome");
        }
    }
}
