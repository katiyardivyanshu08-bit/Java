public class A_2_first_occur {
    public static void main(String[] args) {
        int [] nums = {2,1,1,1,2};
        int target = 1;
        int n = nums.length;
        int st = 0;
        int end =n-1;
        int idx=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target)  {
                idx=mid;
                end=mid-1;
            }
            else if (nums[mid]<target) st=mid+1;
            else end = mid-1;
         }
         System.out.println(idx);
    }
}
