public class A_7_hcf {
    public static int gcd(int a , int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a=45;
        int b=27;
        System.out.println(gcd(a, b));
        
        // int n = Math.min(a,b);
        // // System.out.println(5%6); // 5
        // for(int i=n ; i>=1 ; i--){
        //     if(a%i==0 && b%i==0){
        //         System.out.println(i);
        //         break;
        //     }
        // }
    }
}