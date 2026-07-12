public class A_5_power {
    public static void main(String[] args) {
        int x=2;
        int b=5;
        System.out.println(pow(x,b));
    }
    public static int pow(int x , int b) {
        if(b==0) return 1;

        int call = pow(x,b/2);
        if(b%2==0){
        return call*call;
        }
        else  return x*call*call;
    }
    // public static int pow(int x , int b) {
    //     if(b==0) return 1;
    //     return x*pow(x,b-1);
    // }
}
