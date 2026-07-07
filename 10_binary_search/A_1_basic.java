public class A_1_basic {
    public static void main(String[] args) {
        // linear search -> all element search one by one 
        // bianry serach -> reduction of search space by half every search
        // array sorted ho or not  O(logn) 
        // it remove maximum traversal in array
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int n = nums.length;
        int st = 0;
        int end =n-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target)  {
                System.out.print(mid);
                return;
            }
            else if (nums[mid]<target) st=mid+1;
            else end = mid-1;
         }

    }
}
