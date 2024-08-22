package Strings_wala;
import java.util.Scanner;

public class Reverse {
    //Approach 1  using toCharArray()
    public static void RevString(String str){
        char arr[]= str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    //Approach 2   using charAt(index)
    public static void Rev_charat_String(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    //Approach 3 using StringBuffer
    public static void Sbuffer(String str){
        StringBuffer sb=new StringBuffer(str);
        System.out.print(sb.reverse());
        System.out.println();
    }

    //Approach 3 using StringBuilder
    public static void Sbuilder(String str){
        StringBuilder sb=new StringBuilder(str);
        System.out.print(sb.reverse());
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String Userinputstr= sc.nextLine();
        RevString(Userinputstr);
        Rev_charat_String(Userinputstr);
        Sbuffer(Userinputstr);
        Sbuilder(Userinputstr);
    }
}
