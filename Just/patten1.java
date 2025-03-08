package Just;

public class patten1 {
    public static void main(String[] args) {
        // int i, j;
        // for(i=0;i<5;i++){
        //     for(j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // *
        // **
        // ***
        // ****
        // *****



        // int i, j;
        // char ch=65;
        // for(i=0;i<4;i++){
        //     for(j=1;j<=4;j++){
        //         if(i%2==0){
        //             System.out.print(j);
        //         }else{
        //             if(j==1){
        //                 System.out.print(ch);
        //             }else{
        //                 System.out.print((char)(ch+32));
        //             }
        //         }
        //     }
        //     if(i%2!=0){
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // 1234
        // Aaaa
        // 1234
        // Bbbb



        // int i, j;
        // for(i=0;i<5;i++){
        //     for(j=5;j>i+1;j--){
        //         System.out.print(" ");
        //     }

        //     for(j=0;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        //     *
        //    **
        //   ***
        //  ****
        // *****



        int i, j;
        for(i=5;i>0;i--){
            char ch=65;
            for(j=0;j<=i-2;j++){
                System.out.print(" ");
            }

            for(j=5;j>=i;j--){
                System.err.print(ch);
                ch++;
            }

            ch--;
            for(j=5;j>i;j--){
                ch--;
                System.out.print(ch);
            }
            
            System.out.println();
        }

        //     A
        //    ABA
        //   ABCBA
        //  ABCDCBA
        // ABCDEDCBA

    }
}
