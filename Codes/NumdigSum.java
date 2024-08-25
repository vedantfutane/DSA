package Codes;

public class NumdigSum {
    public static int lastDigSum(int n){
        int sum=0;
        while(n>0){
            int lastdig=n%10;
            sum=sum+lastdig;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5654;
        System.out.println(lastDigSum(n));
    }
}
