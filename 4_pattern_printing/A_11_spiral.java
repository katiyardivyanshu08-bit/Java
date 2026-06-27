public class A_11_spiral {
    public static void main(String[] args) {
        // devide in 25 %

        int row = 4;
        
        for(int i=1;i<=2*row-1;i++){

            for(int j=1;j<=2*row-1;j++){
                int a=i , b=j;
                // same h 3,5  2,6   1,7   (2*n-i)
                if(i>row) a=2*row-i;
                if(j>row) b=2*row-j;
                 System.out.print(Math.min(a,b)+" ");
                //or
                // System.out.print(((j>i)?i:j)+" ");
                //or
                // if(j>i) System.out.print(i);
                // else System.out.print(j);

            }
            
        System.out.println();
        }
    }
}
