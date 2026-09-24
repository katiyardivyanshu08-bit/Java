// Sorting	            Main technique used
// Bubble Sort	        Repeated comparison + swapping
// Selection Sort	    Find minimum/maximum + selection
// Insertion Sort	    Incremental insertion
// Merge Sort	        Recursion + Divide & Conquer
// Quick Sort	        Recursion + Divide & Conquer + Partitioning
// Cyclic Sort	        Index placement

// SORTING ALGORITHMS – TIME & SPACE COMPLEXITY
// Algorithm          Best Case      Average Case    Worst Case     Space
// -----------------------------------------------------------------------
// Bubble Sort        O(n)           O(n²)           O(n²)          O(1)
// Selection Sort     O(n²)          O(n²)           O(n²)          O(1)
// Insertion Sort     O(n)           O(n²)           O(n²)          O(1)
// Merge Sort         O(n log n)     O(n log n)      O(n log n)     O(n)
// Quick Sort         O(n log n)     O(n log n)      O(n²)          O(log n)*
// Cyclic Sort        O(n)           O(n)            O(n)           O(1)

public class A_1_bubble_sort {
    public static void main(String[] args) {
        int [] a = {1,5,8,-6,4,-8,4,8,-2,3};
        int n = a.length ;
        //repeatedly swap adjacent element
        // stable like two elemnt same 7a and 7b when sort it same order
        // best case -> O(n) and remaining O(n2)
        for(int i=0 ; i<n;i++){
            boolean swap =false;
            for(int j=0 ; j<n-i-1;j++){  // best case  mai O(n) although it is a O(n2)
                if(a[j]>a[j+1]){
                    int temp = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = temp ;
                    swap=true;
                }
                
            }
            if(swap==false) break ;
        }
        for(int i:a) System.out.print(i+" ");


        // for(int i=0 ; i<n;i++){
        //     for(int j=0 ; j<n-i-1;j++){  // averge case ) worst case -> when j=0 to start
        //         if(a[j]>a[j+1]){
        //             int temp = a[j] ;
        //             a[j] = a[j+1] ;
        //             a[j+1] = temp ;
        //         }
                
        //     }
        //     System.out.print(a[i]+" ");
        // }
    }
}
