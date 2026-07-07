public class A_2_selection_sort {
    public static void main(String[] args) {
        int [] arr = {1,5,8,-6,4,-8,4,8,-2,3};
        int n = arr.length ;
        // find smallest element put in -> then decrese size from left
        // all O(n2)
        for(int i=0;i<n-1;i++) { //// k th sortest elemt replace n
            int min = Integer.MAX_VALUE, minindx = -1;
            for(int j=i;j<n;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindx];
            arr[minindx] = temp;
        }
        //or
        // for(int i=n-1;i>=3;i--) { 
        //     int max = Integer.MIN_VALUE, maxindx = -1;
        //     for(int j=i;j>=0;j--) {
        //         if (arr[j] > max) {
        //             max = arr[j];
        //             maxindx = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[maxindx];
        //     arr[maxindx] = temp;
        // }
        for(int x : arr){
            System.out.print(x+" ");
        }
        // System.out.println();
        // System.out.print(arr[k-1]);
        
    }
}
