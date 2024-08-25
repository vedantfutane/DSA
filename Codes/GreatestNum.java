package Codes;

public class GreatestNum {
    public static void GreatestNumber(int a, int b, int c){
        if(a>b){
            if(a>c){
                System.out.println("A is greatest");
            }else{
                System.out.println("C is greatest");
            }
        }else{
            if(b>c){
                System.out.println("B is greatest");
            }else{
                System.out.println("C is greatest");
            }
        }
    }
    public static void main(String[] args) {
        GreatestNumber(122,104,54);
    }
}
