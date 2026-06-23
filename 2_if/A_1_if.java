import java.util.Scanner;
public class A_1_if {
        public static void main(String[] args) {
        System.out.print("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();

        // if (x%2==0) System.out.println("Even");
        // else System.out.println("Odd");
        
        // ternary opretor
        // condition ? sach : galat
        System.out.println(x+" "+((x%2==0) ? "Even" : "Odd")); 

        sc.close();
}
}
 