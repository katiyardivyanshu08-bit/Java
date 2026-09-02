import java.util.Scanner ;
public class A_2_vowel {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        String t = sc.nextLine().toLowerCase(); // what are you doing
        // t=t.toLowerCase();
        System.out.println(t); 
        int count=0;
        String vowel="aeiouAEIOU";
        for(int i=0 ; i<t.length() ; i++){
           if(vowel.indexOf(t.charAt(i))!=-1){
                count++;
            }
            //or
            // if( t.charAt(i)=='a' || 'e' || 'i' || 'o' || 'u' ){
            //         count++;
            // }
            // or
            // if( t.charAt(i)=='a' || t.charAt(i)=='e' ||t.charAt(i)=='i' ||t.charAt(i)=='i' ||t.charAt(i)=='u' ){
            //         count++;
            // }

        }
        System.out.println(count);
        sc.close();
   } 
}
