package Just;

import java.util.Scanner;

public class Basic {
    public static int sumofDig(int n){
        // Base case to end recursion
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n + sumofDig(n - 1);
    }
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result= sumofDig(n);
        System.out.println("The sum of "+n+" digits from 1 is :"+result);
    }


}
