public class A_6_rev_num {
    public static int rev(int n, int r) {
        if (n == 0)
            return r;
        
        return rev(n / 10, r * 10 + n % 10);
    }
    
    public static void main(String[] args) {
        int n = -2456;
        System.out.println(rev(n, 0));
    }   
    //or (void)
    // public static void rev(int n,int r){
    //     if(n==0) {
    //         System.out.print(r);
    //         return ;
    //     }
    //     rev(n/10,r*10+n%10);
    // }
    // public static void main(String[] args) {
    //      int n = 2456;
    //      rev(n,0);
    // }
}
