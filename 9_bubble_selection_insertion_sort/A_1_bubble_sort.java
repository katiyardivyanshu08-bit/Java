public class A_1_bubble_sort {
    public static void main(String[] args) {
        int [] a = {1,5,8,-6,4,-8,4,8,-2,3};
        int n = a.length ;
        
        for(int i=0 ; i<n;i++){
            int swap =0;
            for(int j=i+1 ; j<n;j++){  // best case  mai O(n) although it is a O(n2)
                if(a[i]>a[j]){
                    int temp = a[i] ;
                    a[i] = a[j] ;
                    a[j] = temp ;
                    swap++;
                }
                
            }
            if(swap==0) break ;
        }
        for(int i:a) System.out.print(i+" ");


        // for(int i=0 ; i<n;i++){
        //     for(int j=i+1 ; j<n;j++){  // averge case ) worst case -> when j=0 to start
        //         if(a[i]>a[j]){
        //             int temp = a[i] ;
        //             a[i] = a[j] ;
        //             a[j] = temp ;
        //         }
                
        //     }
        //     System.out.print(a[i]+" ");
        // }
    }
}
