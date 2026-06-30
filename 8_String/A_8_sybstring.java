public class A_8_sybstring {
    public static void main(String[] args) {
        String s = "6759";
        int n = s.length();

        int num =0;
        for(int i =0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){
                 num+= Integer.parseInt(s.substring(i,j+1));

                // System.out.print(s.substring(i,j+1)+" ");

            }
            //  System.out.println();
        }
        System.out.println(num);
    }
}
