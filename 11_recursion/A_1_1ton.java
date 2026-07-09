public class A_1_1ton {
    static int b=20;
    public static void main(String[] args) {
        int x=1;
        n(x);  

        // System.out.print("\n"+n(x));    // it return value                   
    } 
    //void
    public static void n(int a){
        if(a>b) return;
        System.out.print(a+" ");
        n(a+1);
    }
    
    //or
    // public static void main(String[] args) {
    //     int x=1;
    //     int b=20;
    //     n(x,b);  

    //     // System.out.print("\n"+n(x));    // it return value                   
    // } 
    // //void
    // public static void n(int a,int b){
    //     if(a>b) return;
    //     System.out.print(a+" ");
    //     n(a+1 , b);
    // }

    //return
    // public static int n(int a){
    //     if(a==10) return -1;     //-1 not print only return
    //     System.out.print(a+" ");
    //      return n(a+1);
    // }

}
