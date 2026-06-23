import java.util.Arrays;
public class A_4_shallow_deep_copy {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        //shallow copy
        // int []x = arr; // x is shallow copy (only name different but array same ) of arr
        // x[0]=100;
        // System.out.println(x[0]);
        // System.out.println(arr[0]);

        // deep copy 
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0]=100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
