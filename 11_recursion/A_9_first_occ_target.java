public class A_9_first_occ_target {
    public static void fOcc(int [] arr ,int target ,int st ,int end){
        int mid = st+(end-st)/2;
        if(st>end) return;
        else if(arr[mid]==target) {
            if(mid!=0 && arr[mid]==arr[mid-1]) fOcc(arr, target, st, mid-1);
            else System.out.print(mid);

        } 
        else if(arr[mid]>target)  fOcc(arr,target,st,mid-1);
        else  fOcc(arr,target,mid+1,end);

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,4,5};
        int n=arr.length;
        int tar = 4;
        fOcc(arr,tar,0,n-1);
        
    }
}
