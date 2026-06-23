public class A_8_wave {
    public static void main(String[] args) {
        int [] a = {1,2,6,7,8,13,15};
        int n = a.length;
        for(int i = 1 ; i<n ; i=i+2){
            // index out of bound if you start from 0 {if(i==n-1)break;}
            int temp = a[i-1] ;
            a[i-1]=a[i];
            a[i]=temp;
            // i++;
        }

        for( int b : a) System.out.print(b+" ");

    }
}
