public class A_6_rev_two_pointer {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5,6};
    //    int n=arr.length;
       // revrse part of a array
       int i =2 ;//0 ;
       int j=4 ;//n-1;
       while (i<j) {
            int temp = arr[i] ;
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
       }

    // or
    // for (int i =0 ;i<n/2 ; i++){
    //     int temp = arr[i] ;
    //         arr[i]=arr[n-1-i];
    //         arr[n-1-i]=temp;
    // }
        
       for( int x : arr)  System.out.print(x+" ");
       
    }
}
