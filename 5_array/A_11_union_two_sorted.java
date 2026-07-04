import java.util.*;
public class A_11_union_two_sorted {
    public static void main(String[] args) {
        int [] a={1,2,6,2,4};
        int [] b={1,2,5,2,8,7};
        Arrays.sort(a);
        Arrays.sort(b);
        int n1 =a.length;
        int n2 =b.length;
        int x=0 , j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(x<n1 && j<n2){
            if (a[x]<b[j]){
                ans.add(a[x]);
                x++;
            }
            else {
                ans.add(b[j]);
                j++;
            }
        }
        while (x < a.length) {
            ans.add(a[x]);
            x++;
        }
        while (j < b.length) {
            ans.add(b[j]);
            j++;
        }
        System.out.println(ans);
        
        int [] dup = new int[ans.size()];
        // duplicate array
        for(int t =0 ;t<ans.size();t++){
            dup[t]=ans.get(t);
        }
        // remove duplicates
        ArrayList<Integer> r = new ArrayList<>();
        r.add(dup[0]);   // First element always unique

for (int i = 1; i < dup.length; i++) {
    if (dup[i] != dup[i - 1]) {
        r.add(dup[i]);
    }
}

        System.out.println(r);

    }
}
