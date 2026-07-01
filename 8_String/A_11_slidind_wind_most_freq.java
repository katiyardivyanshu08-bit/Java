import java.util.*;
public class A_11_slidind_wind_most_freq {
   public static void main(String[] args) {
        String s="cutout";
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i=0, j=0;
        while(j<n){
            if(arr[i]==arr[j]) j++;
            else{
                int freq = j-i;
                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }
           System.out.println(ans);
        
        
        // int n = s.length();
        // int maxFreq = -1;
        // char ans = s.charAt(0);
        // for(int i=0;i<n;i++){
        //     int freq = 1;
        //     char ch = s.charAt(i);
        //     for(int j=i+1;j<n;j++){
        //         if(s.charAt(j)==ch) freq++;
        //     }
        //     if(freq>maxFreq){
        //         maxFreq = freq;
        //         ans = ch;
        //     }
        //     else if(freq==maxFreq && ch<ans){
        //         ans = ch;
        //     }
        // }
        //    System.out.println(ans);
   } 
}
