public class A_1_Basic {
    public static void main(String[] args) {
        //imutable like(name)
        String name = "Divyanshu";
        System.out.println(name.charAt(0)); //a
        for(int i=0 ; i<name.length() ; i=i+2){
            System.out.print(name.charAt(i)+" "); //a
        }
   }
}
