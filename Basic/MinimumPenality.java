import java.util.*;
import java.util.Arrays;

public class MinimumPenality{

    static int FindPenalty(int n, int arr[]){
        int penality=0;
        Arrays.sort(arr);

        for(int i=1;i<n;i++){
            penality += Math.abs(arr[i]-arr[i-1]);
        }
        return penality;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();

        int [] arr= new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(FindPenalty(n, arr));
    }
}