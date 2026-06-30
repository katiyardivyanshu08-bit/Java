public class A_10_rev {
    public static void main(String[] args) {

// String s = "rajat";
// char[] arr = s.toCharArray();
// int i = 0, j = arr.length - 1;
// while (i < j) {
//     char temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
//     i++;
//     j--;
// }
// String ans = new String(arr);
// System.out.println(ans);

//or

String s="Aditya";
// StringBuilder sb=new StringBuilder(s);
// sb.reverse();
// s=sb.toString();
// System.out.println(s);
System.out.println(new StringBuilder(s).reverse().toString());

    }
}
