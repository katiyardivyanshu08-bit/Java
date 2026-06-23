import java.util.Scanner;

public class A_1_Basic {
   public static void main(String[] args) {
      // input 
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a No of Row : ");
         int row = sc.nextInt();
         System.out.print("Enter a No of col : ");
         int col = sc.nextInt();
         
         int [][] arr = new int[row][col]; 
         int r = arr.length;
         int c = arr[0].length;

         System.out.println("Enter a Elements : ");
         
         for(int i =0 ; i<r; i++){
            for(int j = 0 ; j<c ; j++){
               arr[i][j]=sc.nextInt();
            }
            // System.out.println();A
         }

         System.out.println("Your matrix is : ");
         
        for(int i =0 ; i<r; i++){
            for(int j = 0 ; j<c ; j++){
            System.out.print(arr[i][j]+" ");
            }
         System.out.println();
        }


       //   int [][] arr = new int[3][3]; //{{0,0,0},{0,0,0},{0,0,0}}
      //   int [][] arr = {{1,4,2},{9,5,3},{0,7,8}};
      //   int r = arr.length;
      //   int c = arr[0].length;
      //   for(int i =0 ; i<r; i++){
      //       for(int j = 0 ; j<c ; j++){
      //       System.out.print(arr[i][j]+" ");
      //       }
      //    System.out.println();
      //   }
   } 
}
