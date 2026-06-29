public class A_7_compareToString_method {

        public static int compareTo(String a, String b) {

        int n = Math.min(a.length(), b.length());

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }

    public static void main(String[] args) {

        String a = "gitanjali";
        String b = "priya";

        System.out.println("a compared to b = " + compareTo(a, b));
        System.out.println("b compared to a = " + compareTo(b, a));
    }
}
        
        // String a = "harshita";
        // String b = "harsh";
        // System.out.println(a.compareTo(b)); // (a-b) 3 letter left if b to a so -3

        //  a = "harshita";
        //  b = "harshk";
        // System.out.println(a.compareTo(b)); //a-b
//     }
// }
