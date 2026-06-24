public class A_2_maximum_row{
    public static void main(String[] args){
        int [][] arr = {{1,4,2},{9,5,3},{0,7,8}};
        int r = arr.length;
        int c = arr[0].length;

        int maxr=Integer.MIN_VALUE;
        int row = -1;

        System.out.print("SUm of row : \n");
        for(int i =0 ; i<r; i++){
            int sum_row =0;
            // int sum_col =0;
            for(int j = 0 ; j<c ; j++){
                sum_row+= arr[i][j];
                // sum_col+=arr[j][i];

                
            }
        if(sum_row>maxr){
            maxr=sum_row;
            row = i+1;
        }
        System.out.print(sum_row);
        // System.out.print(sum_col);
        System.out.println();
    }
    System.out.println("Maximum row : "+row);
        
    }
}
