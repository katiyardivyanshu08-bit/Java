public class A_6_built_in_method {
    public static void main(String[] args) {
        // String s = "rajat katiyar";
        // System.out.println(s.indexOf('a'));  // first occurance return 
        // System.out.println(s.lastIndexOf("a"));  // if not return -1
        // System.out.println(s.contains("kat"));  // true
        // System.out.println(s.startsWith("rat"));
        // lexographically
         // rajat rajt  -> rajat < rajt  beacause a come fist
        
         // concate
        //  String b =" from Up";
        //  s=s.concat(b);
        //  System.out.println(s);
        //or
        // System.out.println(s+b+1);
        // System.out.println(s+b+10+20);
        // //left to right
        //             //       str+int=str
        // System.out.println(10+20+s+b);
        // System.out.println(10+s+b+20);
        // System.out.println(s+b+(10+20));
        // System.out.println('A'+2+"rajat");

        // int to string
        // int x=10;
        // String s="";
        // // s=s+n;
        // //or
        // s=Integer.toString(x);
        // System.out.println(s); 

        //string to int
        // String str = "1234";
        // int n = Integer.parseInt(str);
        // System.out.println(n+1); //1235

        //length og interger easy way
        // int n =1234;
        // String s="";
        // s+=n;  // but not work for  0012 because it takes only 12
        // System.out.println(s.length());

        // string to character array
        // String s= "rajat";
        // char [] arr = s.toCharArray();
        // System.out.println(arr[0]);
        // for(char ch : arr) System.out.print(ch);

        //subString of string
        String s= "Jaishankar";
        System.out.println(s.substring(0));
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,s.length())); // before n-1

    }
}
