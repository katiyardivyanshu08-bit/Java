public class A_10_bridge {
 public static void main(String[] args) {
    int row = 6;
    int n = 2*row-1;
        for(int i=1;i<=n; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=row-1;i++){

            for(int j=1;j<=n/2+1-i;j++){
                 System.out.print("* ");
                
            }
            for(int k=1 ;k<=2*(i-1)+1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=n/2+1-i;j++){
                 System.out.print("* ");
                
            }
            
        System.out.println();
        }
 }   
}
