public class A_4_fact {
    public static void main(String[] args) {
        int x =5;
        fact(x);
        // System.out.println(x); // 5
        System.out.println(fact(x));
    }
    public static int fact(int x) {
        if(x==0 || x==1) return 1;    // int func
        return x * fact(x-1);

    }
}
