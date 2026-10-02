import java.util.*;
class insuffi extends Exception{

}
class bak{
    int balance;
    bak(int n){
        balance=n;
    }
     void withdraw(int n) throws insuffi{
        if(n>balance){
            throw new insuffi();
        }
        balance -=n;
        System.out.println("balance :"+balance  );
    }
}
class A_1{
    public static void main(String[] args){
        bak b1 = new bak(5000);
        try {
            b1.withdraw(50000);
        }
        catch(insuffi e){
            System.out.println("error");
        }


    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter username: ");
    //     String username=sc.nextLine();

    //     boolean valid=true;

    //     // Rule 1 - username must start with a letter
    //     if(username.length()==0){
    //         System.out.println("Invalid Username");
    //         System.out.println("Reason: Username cannot be empty");
    //         valid=false;
    //     }
    //     else if(!Character.isLetter(username.charAt(0))){
    //         System.out.println("Invalid Username");
    //         System.out.println("Reason: Username must start with a letter");
    //         valid=false;
    //     }

    //     // Rule 2 - minimum 6 characters
    //     if(username.length()<6){
    //         System.out.println("Invalid Username");
    //         System.out.println("Reason: Username must contain at least 6 characters");
    //         valid=false;
    //     }

    //     // Rule 3 - only letters and digits
    //     for(int i=0;i<username.length();i++){

    //         char ch=username.charAt(i);

    //         if(!Character.isLetter(ch) && !Character.isDigit(ch)){
    //             System.out.println("Invalid Username");
    //             System.out.println("Reason: Username can contain only letters and digits");
    //             valid=false;
    //             break;
    //         }
    //     }

    //     // Rule 4 - should not contain admin
    //     String s=username.toLowerCase();

    //     if(s.contains("admin")){
    //         System.out.println("Invalid Username");
    //         System.out.println("Reason: Username should not contain 'admin'");
    //         valid=false;
    //     }

    //     // Using matches()
    //     if(!username.matches("[A-Za-z0-9]+")){
    //         valid=false;
    //     }

    //     if(valid){
    //         System.out.println("Valid Username");
    //     }
    }
}
