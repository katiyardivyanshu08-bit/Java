public class A_7_segregate_0_and_1 {
    public static void main(String[] args) {
        int [] a = {1,1,0,0,1,0,1,1,0};
        int n = a.length;
        int i = 0 , j=n-1;
        while(i<j){
            if(a[i]==0) i++;
            else if (a[j]==1) j--;
            else if(a[i]==1 && a[j]==0){
                a[i]=0;
                a[j]=1;
                i++;
                j--;
            }
        }

        // two pass tecnique
        // int count =0;
        // for(int i =0 ; i<n ; i++){
        //     if(a[i]==0){
        //         count++;
        //     }
        // }
        // for(int i = 0 ; i<count; i++){
        //     a[i]=0;
        // }
        // for(int i = count ; i<n; i++){
        //     a[i]=1;
        // }
        for( int b : a) System.out.print(b+" ");
    }   
}
