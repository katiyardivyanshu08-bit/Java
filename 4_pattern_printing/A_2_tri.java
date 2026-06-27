import java.util.Scanner;

public class A_2_tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = 5;
        // System.out.print("Enter a column : ");
        // int col = sc.nextInt();
        //  int count = 1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                // System.out.print((char)(64+j)+" ");
                // System.out.print(count);  // floyd tri
                // count++;

                //binary
                if((i+j)%2==0) System.out.print("1");
                else System.out.print("0");
                
            }
            System.out.println();
        }
        sc.close();
    }
}
