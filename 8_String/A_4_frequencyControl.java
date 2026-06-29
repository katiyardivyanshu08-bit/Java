public class A_4_frequencyControl {
    public static void main(String[] args) {
         String s = "glamathuranoida";
       int n = s.length();
       int [] arr = new int[26];
       for(int i =0 ; i<n ; i++){
           arr[s.charAt(i)-'a']++;
       }
       for(int i : arr){
           System.out.print(i+" ");
       }
    }
}
