public class A_3_insertion_sort {
    public static void main(String[] args) {
        // inplace sorting shifting the value (copy paste)
        // insertion sort -> divide array in two parts sort and unsorted In each pass, pick 
        // the first element from the unsorted part and insert it into its correct position
        //  in the sorted part.

        // best case -> O(n) otherwise O(n2)
        // stable
        int[] arr = {4, 1, 7, 3, 9, 2, 0, 8};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
