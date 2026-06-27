public class A_8_pyramid {
    public static void main(String[] args) {
        int row = 5;
        int psp=row-1; 
        int pst=1;
        for(int i=1;i<=row;i++){
            // pyramid and revrse tri both
            for(int j=1;j<=psp;j++){        
                  System.out.print("  ");
            }
            
            for(int j=1;j<=pst;j++){   
                       
                System.out.print(j+" ");
            }

            //or
            // for(int j=1;j<=row-i;j++){        
            //       System.out.print("  ");
            // }
            
            // for(int j=1;j<=2*i+1;j++){          
            //     System.out.print("* ");
            // }

            //or
            // for(int j=1;j<=i;j++){           //star
            //     System.out.print("* ");
            // }
            // for(int j=2;j<=i;j++){
            //     System.out.print("* ");
            // }
        psp--;
        pst=pst+2; 
        System.out.println();
        }
    }
}
