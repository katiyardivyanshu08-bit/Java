// public class A_1_Basic {
//    public static void main(String[] args) {
//    }
// }


        // int row = 7;
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=row;j++){
        //         if (i==j || j==row+1-i){
        //             System.out.print("* ");
        //         }
        //         else System.out.print("  ");
                
        //     }
        //     System.out.println();
        // }

import java.util.Scanner;

public class A_6_cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = 7;
        // int row = sc.nextInt();
        // System.out.print("Enter a column : ");
        // int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if (i==j || j==row+1-i){
                    System.out.print("* ");
                }
                else System.out.print("  ");
                
            }
            System.out.println();
        }
        sc.close(); 
    }
}
