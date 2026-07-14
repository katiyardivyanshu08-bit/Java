import java.util.*;
public class A_9_Merge_two_sorted_arr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2,6,6, 9 };
        int[] b = { 2,2,3, 7, 10, 12, 14 };
        int[] c = new int[a.length+b.length];
         int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
        for(int x : c) System.out.print(x+" ");
        
        //or
        // int n1 = a.length;
        // int n2 = b.length;
        // int i = 0, j = 0;
        // ArrayList<Integer> ans = new ArrayList<>();
        // while(i<n1 && j<n2){
        //     if (a[i]<b[j]){
        //         ans.add(a[i]);
        //         i++;
        //     }
        //     else {
        //         ans.add(b[j]);
        //         j++;
        //     }
        // }
        // while (i < a.length) {
        //     ans.add(a[i]);
        //     i++;
        // }
        // while (j < b.length) {
        //     ans.add(b[j]);
        //     j++;
        // }
        // System.out.print(ans);

        // merge sort without dynamic array
        // int[] c = new int[n + l];
        // int k = 0;
        // while (i < n && j < l) {
        //     if (a[i] < b[j]) {
        //         c[k] = a[i];
        //         i++;}
        //     else {
        //         c[k] = b[j];
        //         j++;
        //     }
        //     k++;
        // }

        //     while (j < l) {
        //         c[k] = b[j];
        //         k++;
        //         j++;
        //     }
        
        //     while (i < n) {
        //         c[k] = a[i];
        //         k++;
        //         i++;
        //     }

        // for (int x : c)
        //     System.out.print(x + " ");

    }
}
