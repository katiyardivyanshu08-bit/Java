public class A_8_pyramid {
    public static void main(String[] args) {
    int n = 3;
    int l=2*n+1;
    int nsp=l/2;    //3
    int nst=1;
    int ml=(l/2)+1; //4
    for(int i=1;i<=l;i++){  
        for(int j=1;j<=nsp;j++) {   
            System.out.print(" ");
          }

        for(int k=1;k<=nst;k++){
            System.out.print("*");
        }  
        if(i<ml){
            nsp--;
            nst+=2;
        }
        else {
            nsp++;
            nst-=2;
        }
      
       System.out.println();
     
    }
}
}