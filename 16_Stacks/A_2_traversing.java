import java.util.*;
public class A_2_traversing {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        st1.push(10);
        st1.push(40);
        st1.push(-2);
        st1.push(30);
        st1.push(90);
        // System.out.println(st1);//[10, 40, -2, 30, 90]
        
        // tc=O(n) and sc=O(n)
        // traversing bottom to top
        //st2 is the reverse of st1
        while(st1.size() > 0){
            int top = st1.pop();
            System.out.println(top);
            st2.push(top);
        }
        // System.out.println(st2);//[90, 30, -2, 40, 10]
        
        while(st2.size() > 0){
            System.out.println(st1.push(st2.pop()));
        }
        // System.out.println(st1);//[10, 40, -2, 30, 90]
    }
}
