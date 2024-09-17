//ANAGRAM PROBLEM
// Idea for anagram is that their characters will be the same, just rearranged.
package Strings_wala;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="SILe  NT";
        String str2="LISTE n";

        String s1=str1.replace(" ","").toUpperCase();   // this is for spaces and loweror upper diff case string present so 
        String s2=str2.replace(" ","").toUpperCase();

        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean response= Arrays.equals(a,b);
        if(response == true){
            System.out.println("Strings are Anagram");
        }else{
            System.out.println("String are not Anagram");
        }
    }
}
