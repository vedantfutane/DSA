//PANAGRAM
// Simple hai bidu jisme sentence me yaa string me all alphabets present hooo whaiiicchhhh hai PANAGRAM
package Strings_wala;

public class Panagram {
    public static void main(String[] args) {
        String str="the quick bROWN FOX jumps over The lazy DOG";

        str= str.replace(" ","").toUpperCase();
        char y[]=str.toCharArray();
        int size=y.length;

        int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        // a array me 0 ko 1 kiya jaha jaha jo jo alphabet present h uske uske index pr  
        // yaha smjho ki 0-A, 1-B, ... , 25-Z hai  aur y elane ki liye ascii-65 kiya so it will work   
        //eg. for J:    ascii of J is 75  - 65  = 10  so 10 pr jaa kr 0 ka 1 kr do mtlb hai bhai woo array me bass
        int i=0;
        while(i!=size){
            int index=y[i]-65;
            a[index]=1;
            ++i;
        }

        //Now this one for checkking ki all elements 1 hoo agye kyy so panagram hoga otherwise not panagram
        i=0;
        while(i!=26){
            if(a[i]==1){
                ++i;
            }else{
                System.out.println("String is not Panagram");
                System.exit(0);
            }
        }
        System.out.println("String is Panagram");
    }

}
