public class A_3_insertion_sort {
    public static void main(String[] args) {
        // insertion sort -> divide array in two parts sort and unsorted In each pass, pick 
        // the first element from the unsorted part and insert it into its correct position
        //  in the sorted part.

        // best case -> O(n) otherwise O(n2)
        // stable
        int[] arr = {4, 1, 7, 3, 9, 2, 0, 8};
         for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
