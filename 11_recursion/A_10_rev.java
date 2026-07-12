public class A_10_rev {
    public static int rev(int [] arr, int st , int end) {
        if(st>=end) return -1;
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        return rev(arr, st+1, end-1);

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int n=arr.length;
        rev(arr,0,n-1);
        for(int x:arr) System.out.print(x+" ");
    }
}
