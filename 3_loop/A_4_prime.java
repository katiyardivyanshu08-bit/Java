import java.util.Scanner;

public class A_4_prime {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=1;
        for ( int i = 2 ; i < x ; i++){
            if (x%i==0){
                a=2;
                break;
        }


        }
        System.out.println((a==2)?"Composite":"Prime");

        sc.close();
    }
}
