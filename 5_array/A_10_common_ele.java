import java.util.*;
public class A_10_common_ele {
    public static void main(String[] args) {
        int [] a = {3,4,2,2,4} ;
        int [] b = {3,2,2,7} ;

        ArrayList<Integer> ans = new ArrayList<>();
        int n1=a.length;
        int n2=b.length;
        Arrays.sort(a);
        Arrays.sort(b);

        int i=0 ,j=0;
        while(i<n1 && j<n2){
            if(a[i]==b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<b[j]) i++;
            else j++;
        }
        System.out.print(ans);
    }
}
