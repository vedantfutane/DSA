import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        int []arr={2,43,54,21,5,3,32,325};
        System.out.println("Enter the element that you want to search in array");
        Scanner sc=new Scanner(System.in);
        int key= sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Key found at location "+ (i+1));
            }
        }
    }
}
