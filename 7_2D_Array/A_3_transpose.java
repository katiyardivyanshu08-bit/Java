public class A_3_transpose {
   public static void main(String[] args) {
    int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    int r = arr.length;
    int c = arr[0].length;
    
    System.out.println("Original matrix  : ");
    for(int i =0 ; i<r; i++){
        for(int j = 0 ; j<c ; j++){
            System.out.print(arr[i][j]+" ");
        }
            System.out.println();
        }
        
        //tranpose only for nxn matrix
        for(int i =0 ; i<r; i++){               //triangle
            for(int j = 0 ; j<i ; j++){      
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        System.out.println("same matrix Transpose : ");
        for(int i =0 ; i<r; i++){
            for(int j = 0 ; j<c ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        //only print not change
        // for(int j = 0 ; j<c ; j++){                 //->column = 4
        //     for(int i =0 ; i<r; i++){               //->row = 3
        //         System.out.print(arr[i][j]+" "); //yaha row -> 3 and column -> 4
        //     }
        //  System.out.println();
        // }
    }
}
// wrong
//  for(int i =0 ; i<r; i++){               //->row = 3
//         for(int j = 0 ; j<c ; j++){      //->column = 4
//         System.out.print(arr[j][i]+" "); //yaha row -> 4 and col ->3  thats why index out of bound
//         }
//      System.out.println();
//     }