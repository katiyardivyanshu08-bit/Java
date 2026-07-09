public class A_3_nto1ton {
    static int a=5;
    public static void main(String[] args) {
        n(a);  

    } 
    
    public static void n(int a){
        if(a==0){
            // System.out.print(1+" ");     
             return;
        }        
        System.out.print(a+" ");
        n(a-1); 
        if(a!=1) System.out.print(a+" ");
    }
}
