public class A_3_GlobalVariable {
    static int x=10;  // global variable 
   public static void fun(){
        x=40;
   }
   public static void main(String[] args) {
        System.out.println(x); //10
        x=20;
        System.out.println(x);//20
        fun();
        System.out.println(x);//40

        int x=100;   // local have more priority
        fun(); //pass by value becuse now x is local
        System.out.println(x);//100 not 40
   } 
}
