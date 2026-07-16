public class A_4_MethodOverloading {

    public static int max(int a,int b){
        return (a>b)?a:b;
    }

    public static int max(int a,int b,int c){
        return max(max(a,b),c);
    }

    public static double max(double a,double b){
        return (a>b)?a:b;
    }

    public static void main(String[] args){

        System.out.println(max(10,20));
        System.out.println(max(10,20,15));
        System.out.println(max(5.6,8.2));

    }
}