import java.util.* ;
public class A_1_Basic {
    public static void main(String[] args) {
        //imutable like(name)
        // char [] str = {'r','a','j','a','t'};  // character array or string
        // for(char ele : str){
        //     System.out.print(ele +" ");
        // } 

        // String name = "He is a good boy";
        // System.out.println(name);

        // input 
        Scanner sc = new Scanner(System.in);
        
        String t = sc.nextLine(); // what are you doing
        System.out.println(t);    // what are you doing
        
        String s = sc.next();  // next->before the sapce  what are you doing
        System.out.println(s); // what


        // System.out.println(name.charAt(0)); //a
        // for(int i=0 ; i<name.length() ; i=i+2){
        //     System.out.print(name.charAt(i)+" "); // for index ->a
        // }

        sc.close();

        // String → int
int n = Integer.parseInt(str);

// int → String
String str = String.valueOf(n);

// String → char
char ch = str.charAt(0);

// String → char[]
char[] arr = str.toCharArray();

// char[] → String
String str = new String(arr);

// String → StringBuilder
StringBuilder sb = new StringBuilder(str);

// StringBuilder → String
String str = sb.toString();
   }
}
