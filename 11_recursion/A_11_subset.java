import java.util.*;
public class A_11_subset {  //substring->continuous no {''} , subset->also {''} and 2powN
   public static void main(String[] args) {
        String str = "ab";
        List<String> list = new ArrayList<>();
        subset(str,"",0 , list);
        System.out.print(list); 
          
   }
   public static void subset(String str ,String ans ,int idx,List<String> list) {
        if(idx==str.length()) {
            // if(ans.length()!=0) list.add(ans);  //[ab, a, b]
            list.add(ans);                         //[ab, a, b, ]
            return;
        }
        char ch = str.charAt(idx);
        subset(str,ans+ch,idx+1,list); //pick
        subset(str, ans, idx+1,list);  //skip
   }
}
