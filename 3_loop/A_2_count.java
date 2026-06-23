import java.util.Scanner;

public class A_2_count {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=x;
        int count =0;

        int ld = 0;
        int sum=0;
        int rev = 0;
        for(int i = 1 ; i<=x ; i++){
            if (a>0){
                count+=1;
                ld=a%10;
                sum+=ld;
                rev=rev*10+ld;
                a/=10;
            }
        
        } 
        System.out.print("Number of digit : ");
        System.out.println(count);
        System.out.print("Sum of digit : ");
        System.out.println(sum);
        System.out.print("Reverse of digit : ");
        System.out.println(rev);

        sc.close();
    }
}