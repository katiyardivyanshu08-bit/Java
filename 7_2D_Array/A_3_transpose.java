public class A_3_transpose {
   public static void main(String[] args) {
    int [][] arr = {{1,4,2,9},{9,5,3,4},{0,7,8,3}};
    int r = arr.length;
    int c = arr[0].length;

    
    for(int i =0 ; i<r; i++){
                for(int j = 0 ; j<c ; j++){
                System.out.print(arr[i][j]+" ");
                }
            System.out.println();
        }
    System.out.println("Transpose : ");

    // wrong
    //  for(int i =0 ; i<r; i++){               //->row = 3
    //         for(int j = 0 ; j<c ; j++){      //->column = 4
    //         System.out.print(arr[j][i]+" "); //yaha row -> 4 and col ->3  thats why index out of bound
    //         }
    //      System.out.println();
    //     }

        for(int j = 0 ; j<c ; j++){                 //->column = 4
            for(int i =0 ; i<r; i++){               //->row = 3
                System.out.print(arr[i][j]+" "); //yaha row -> 3 and column -> 4
            }
         System.out.println();
        }
   }
}