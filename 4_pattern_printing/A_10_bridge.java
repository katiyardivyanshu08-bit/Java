public class A_10_bridge {
 public static void main(String[] args) {
    int row = 7;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if (i==j || j==row+1-i){
                    System.out.print("* ");
                }
                else System.out.print("  ");
                
            }
            System.out.println();
        }
 }   
}
