package MultiDimensionalArrays;
public class A_4_for_each{
    public static void main(String[] args) {
    int [][] arr = {{1,4,2,9},{9,5,3,4},{0,7,8,3}};
    int r = arr.length;
    int c = arr[0].length;

        for(int [] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    
        // or
        // for(int i =0 ; i<r; i++){
        //         for(int ele : arr[i]){
        //         System.out.print(ele+" ");
        //         }
        //     System.out.println();
        // }
   }
}
