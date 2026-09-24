public class A_2_selection_sort {
    public static void main(String[] args) {
        int [] arr = {1,5,8,-6,4,-8,4,8,-2,3};
        int n = arr.length ;
        // find smallest element put in -> then decrese size from left
        // all O(n2)
        for(int i=0;i<n-1;i++) { //// k th sortest elemt replace n
            int minindx = i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[minindx]) {
                    minindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindx];
            arr[minindx] = temp;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
        // System.out.println();
        // System.out.print(arr[k-1]);
        
    }
}
