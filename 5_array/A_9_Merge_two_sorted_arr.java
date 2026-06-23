public class A_9_Merge_two_sorted_arr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 6, 9 };
        int[] b = { 3, 7, 10, 12, 14 };
        int n = a.length;
        int l = b.length;
        int[] c = new int[n + l];
        int k = 0;

        int i = 0, j = 0;

        while (i < n && j < l) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;}
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

            while (j < l) {
                c[k] = b[j];
                k++;
                j++;
            }
        
            while (i < n) {
                c[k] = a[i];
                k++;
                i++;
            }

        for (int x : c)
            System.out.print(x + " ");

    }
}
