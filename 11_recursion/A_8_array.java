public class A_8_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int ele =2;
        array(arr,0,ele);
    }
    public static void array(int [] arr , int target,int ele){
        if(target==arr.length) return ;
        if(arr[target]==ele) {
            System.out.println(true);
            return;
        }
        // System.out.print(arr[target]+" ");  
        array(arr,target+1,ele);
        System.out.print(arr[target]+" ");   // reverse
    }
}