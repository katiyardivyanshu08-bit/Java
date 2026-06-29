import java.util.Scanner ;

public class A_3_palimdrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String t = sc.nextLine().toLowerCase(); // what are you doing
        int i = 0;
        int j = t.length()-1;
        Boolean a = true;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)){
                a=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println((a==false)?"No":"Yes");


        // t=t.toLowerCase();
        // String rev = "";  
        // for(int i=t.length()-1 ; i>=0 ; i--){
        //    rev+=t.charAt(i);

        // }
        // System.out.println(rev);
        // if(t.equals(rev)) System.out.println("Palimdrome");   // error for (==) it use for primitive data types and string is objects
        //                                                         // if you crateing a new string use .equal()
        // else System.out.println("Not");
        sc.close();
   
    }
}
