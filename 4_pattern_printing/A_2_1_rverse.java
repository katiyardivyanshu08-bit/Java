public class A_2_1_rverse {
   public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
               System.out.print("  ");
            }

            for(int j=1;j<=i;j++){        // star
                  System.out.print(j+" ");
               
               //method 1
               //  if (i+j>row){
               //      System.out.print("* ");
               //  }
               //  else System.out.print("  ");
                
            }
            System.out.println();
        }
   }
}