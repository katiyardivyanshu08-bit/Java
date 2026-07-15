public class A_1_basic {
   // o(n) and sc=>o(1)
   // not neg work only for 0 to n or 1 to n or n-1 etc
   // qs like (missing element , 287 ,442 ,448,645,41 hard
   public static void cyclicSort(int[] nums){
        int n=nums.length;
        int i=0;
        while(i<n){
            int correct=nums[i]; // including 0 and nums[i]-1 for st from 1 
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else i++;
        }
    }

    public static void main(String[] args){
        int[] nums={3,5,2,1,4,0};
        cyclicSort(nums);

        for(int i=0;i<nums.length;i++) System.out.print(nums[i]+" ");
    }
}

