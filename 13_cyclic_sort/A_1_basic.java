public class A_1_basic {
   // o(n) and sc=>o(1)
   // work only for 0 to n or 1 to n
   // qs like missing element , 
   public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else i++;
        }
    }

    public static void main(String[] args){
        int[] arr={3,5,2,1,4,0};
        cyclicSort(arr);

        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}

