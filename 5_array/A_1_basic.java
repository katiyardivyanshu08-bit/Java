// int [] arr = {};
// int [] ar = new int[7];

// input array

import java.util.*;
public class A_1_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // string

        // System.out.print("Enter size: ");
        // int n = sc.nextInt();

        // String[] arr = new String[n];
        // System.out.println("Enter strings:");

        // for(int i = 0; i < n; i++) {
        //     arr[i] = sc.next();       // only next() one word or letter
        //                               //char ch = sc.next().charAt(0); SIngle Letter

        // }

        // for(int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }

        // Number
        System.out.print("Enter Size of array : ");
        int size = sc.nextInt();

        int [] a = new int[size];
        for(int i=0 ; i<a.length;i++){
            System.out.print("Enter a "+(i+1)+" element : ");
            int x = sc.nextInt();
            a[i]=x;
        }
        System.out.print(Arrays.toString(a));
        // for(int i=0 ; i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        sc.close();
     }
}

// import java.util.*;
// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,8,8,8,8,8,7,7};
//         Arrays.sort(a);
//         for(int i=0 ; i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//      }
// }

//Leetde 35
// import java.util.*;
// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,3,5,6 , 2,3 ,5 };
//          int target = 4;
//         for(int i=0 ; i<a.length;i++){
//             if (a[i]>=target ){

//                 System.out.print(i);
//                 break ;
//             }
//             else if (i==a.length-1) {
//                 System.out.println(i+1);
//             }
            
//         }
//      }
// }


// import java.util.*;
// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,8,8,8,8,8,7,7};
//         Arrays.sort(a);
//         for(int i=0 ; i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//      }
// }

// Last index to find
// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,8,8,8,8,8,7,7};
//          int target = 8;
             
//          for(int i=0;i<a.length;i++){
//              if (a[i]==target){
//                  System.out.println("First Index : "+i);
//                  break;
                 
//              }
//          }
//         for(int i=a.length-1;i>=0;i--){
//             if (a[i]==target){
//                 System.out.print("Last Index : "+i);
//                 break ;
                
//             }
//         }
//     }
// }

//Second Largest Element
// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,7,2,9,6,7};
        
//          int x = a[0];
              
//         for(int i=0;i<a.length;i++){
//             if (a[i]>x){
//                x=a[i];
//             }
//         }
//          System.out.println("Max : "+x);
//      }
// }


// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,7,2,7,6,7};
//          int target = 7;
//          int x = 0;
//         int count =0;        
//         for(int i=0;i<a.length;i++){
//             if (a[i]==target){
                
//                 x = 1;
//                 count++;
//             }
//         }
//         if(x==1){System.out.println("Yes");}
//         else System.out.println("No");

//         System.out.println("Count : "+count);
//     }
// }


// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,4,2,5,6,7};
//         // int [] b = new int[5]; //dynamic memory allcation   , by default {0,0,0,0,0}   
//         // System.out.println(a[4]);
//         // System.out.println(b[4]);
//          int count = 0;
//         for(int i=0;i<a.length;i++){
//             count+=a[i];
//             // System.out.println(a+" "); // address
//         }
//         System.out.print("Sum of array : ");
//         System.out.print(count);
//     }
// }


// public class A_1_basic {
//     public static void main(String[] args) {
//         int [] a = {1,2,3,4,5};
//         int [] b = new int[5]; //dynamic memory allcation   , by default {0,0,0,0,0}   
//         System.out.println(a[4]);
//         System.out.println(b[4]);

//         for(int i=0;i<a.length;i++){
//             b[3]=45;
//             b[4]=55;
//             // System.out.print(a[i]+" ");
//             System.out.print(b[i]+" ");
//         }
//     }
// }
