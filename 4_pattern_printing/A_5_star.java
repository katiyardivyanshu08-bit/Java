import java.util.Scanner;

public class A_5_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row : ");
        int row = sc.nextInt();
        // System.out.print("Enter a column : ");
        // int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if (i==(row/2)+1 || j==(row/2)+1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
                
            }
            System.out.println();
        }
        sc.close(); 
    }
}

