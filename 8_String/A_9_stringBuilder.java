import java.util.* ;
public class A_9_stringBuilder {
    public static void main(String[] args) {
        // StringBuilder s = new StringBuilder("ram"); //StringBuilder()
        // System.out.println(s.length()+" "+s.capacity());
        // s.append("Raghav");
        // System.out.println(s.length()+" "+s.capacity());
        // System.out.println(s);

        // s.setCharAt(1,'o');
        // System.out.println(s);

        // s.deleteCharAt(1);
        // System.out.println(s);
        
        // s.delete(2,5); //2to 4
        // System.out.println(s);

        // s.insert(1, 'a');
        // System.out.println(s);
        //reverse
        // s.reverse();
        // System.out.println(s);


        // String t = s.toString(); //object to string
        // System.out.println(t);

        //input
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb); 

        sc.close();
    }
}
