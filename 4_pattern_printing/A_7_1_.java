public class A_7_1_ {
   public static void main(String[] args) {
         int row = 5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){        // star
                  System.out.print("  ");
            }
            
            for(int j=1;j<=row-i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
   }
}