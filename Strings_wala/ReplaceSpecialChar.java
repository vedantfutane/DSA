package Strings_wala;
import java.util.Scanner;

public class ReplaceSpecialChar {
    public static void RemoveSpecialChar(String str){
        String plainString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainString);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        RemoveSpecialChar(str);
    }
}
