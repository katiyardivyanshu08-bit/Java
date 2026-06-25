import java.util.Scanner;

public class A_1_Multi {
    public static void main(String[] args) {
         int[][] A={{1,2,3},{4,5,6}};
        int[][] B={{7,8},{9,10},{11,12}};

        int rowA=A.length,colA=A[0].length;
        int rowB=B.length,colB=B[0].length;



        if(colA!=rowB){
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] C=new int[rowA][colB];

        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                for(int k=0;k<colA;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }


        
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }
}
