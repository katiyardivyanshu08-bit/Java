public class A_10_1_reverse_word_in_str_remove_spa {
    public static void main(String[] args) {
        String  s = "My name is rajat";

        String [] arr = s.trim().split("\\s+");
        int n=arr.length;
        
        for(int i=0 ; i<n ; i++){
            String rev ="";
            for(int j=arr[i].length()-1; j>=0;j--){
                String q = arr[i];
                rev+=q.charAt(j);
            }
            arr[i]=rev;
        }
        // for(String x : arr) System.out.print(x+" ");
        // System.out.println();
        System.out.println(String.join(" ", arr));

    }
}
