// import java.util.Scanner;
// public class A_2_Kth_LArgest_Element {
//     public static void main(String[] args) {
//         int [] a = {1,3,2,6,5,6};
//         int fmax = Integer.MIN_VALUE ;
//         int smax = Integer.MIN_VALUE ;
//         int n = a.length ;
//         for(int i = 0 ; i < n ; i++){
//             if(a[i]>fmax){
//                 smax=fmax;
//                 fmax=a[i];
//             }
//              else if (a[i]>smax && a[i]!=fmax){
//                 smax=a[i];
//              }
//         }
//         System.err.println(fmax);
//         System.err.println(smax);


//      }
// }

// Second Lar
    // int first = 999;
    // int second = 999;

    // for(int i = 0; i < prices.length; i++) {

    //     if (prices[i] < first) {
    //         second = first;
    //         first = prices[i];
    //     }
    //     else if (prices[i] < second && prices[i]!=first) {
    //         second = prices[i];
    //     }
    // }

// Third lar

    // int first = Integer.MAX_VALUE;
    // int second = Integer.MAX_VALUE;
    // int third = Integer.MAX_VALUE;

    // for(int i = 0; i < prices.length; i++) {

    //     if(prices[i] < first) {
    //         third = second;
    //         second = first;
    //         first = prices[i];
    //     }
    //     else if(prices[i] < second) {
    //         third = second;
    //         second = prices[i];
    //     }
    //     else if(prices[i] < third) {
    //         third = prices[i];
    //     }
    // }

import java.util.Scanner;
public class A_2_Kth_LArgest_Element {
    public static void main(String[] args) {
        int [] a = {1,8,8,7,6,8,8,8,7,7};
        int [] b = new int[a.length];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  : ");
        int x = sc.nextInt();

        //Bubble Sort
        System.out.print("Sorted List : ");
        for(int i=0 ; i<a.length;i++){
            for(int j=i+1 ; j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i] ;
                    a[i] = a[j] ;
                    a[j] = temp ;
                }
                
            }
            System.out.print(a[i]+" ");
        }
        System.out.print('\n');


        // Remove Duplicates and 26 and 41
        // b[0]=a[0]; /// wrong
        // int j = 0;
        // for (int i = 1; i < a.length; i++) {
        //     if (a[i] != a[j]) {
        //         j++;
        //         b[j] = a[i];
        //     }
        // }
        //or
        int k=0;
        b[k++]=a[0];
        for(int i=1 ; i<a.length ; i++){

                if (a[i]!=a[i-1]){
                    b[k++]=a[i];
                }
                
            }
        System.out.print(x+"_Largest Element : ");
        System.out.println(b[x-1]);
        
        sc.close();
     }
}
