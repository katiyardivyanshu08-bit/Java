public class A_3_sqrt {
    public static void main(String[] args) {
        int sq = 25 ;

        int x=0;
        for(int i=1 ; i<=sq ; i++){
            if(i*i>sq) break;
            x=i;
        }
        System.out.println(x);
    }
}