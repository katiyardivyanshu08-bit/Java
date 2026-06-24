package MultiDimensionalArrays;
public class A_5_mat_snake_pattern {
   public static void main(String[] args) {
          int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{12,4,5}};
        int r = arr.length;
        int c = arr[0].length;

        //column
        for(int j = 0; j < c; j++) {
            if(j % 2 == 0) {
                for(int i = 0; i < r; i++) {
                     System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for(int i = r - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        System.out.println();
        }

        // row
        // for(int i =0 ; i<r; i++){
        //     if(i%2==0){
        //         for(int j = 0 ; j<c ; j++){
        //             System.out.print(arr[i][j]+" ");
        //         }
        //     }
        //     else {
        //         for(int j = c-1 ; j>=0 ; j--){
        //             System.out.print(arr[i][j]+" ");
        //         }
        //     }
        // System.out.println();
        // }

    }
}