import java.util.Scanner;

public class A_1_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row : ");
        int row = sc.nextInt();
        System.out.print("Enter a column : ");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
