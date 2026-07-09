public class A_2_nto1 {
    static int a=20;
    public static void main(String[] args) {
        n(a);  

    } 
    
    public static void n(int a){
        if(a==0) return;        // base case 
        // n(a-1);  // 1,2,3,4
        System.out.print(a+" ");// work
        n(a-1);  // 20 19 18 17  // function call
    }
    
}
