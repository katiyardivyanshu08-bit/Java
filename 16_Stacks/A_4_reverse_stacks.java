import java.util.*;
public class A_4_reverse_stacks {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        System.out.println(st1);//[10, 20, 30, 40, 50]

        // ---------------------------------------------------------------------------
        // Time Complexity  = O(n²)
        // Space Complexity = O(n)
        // ArrayList<Integer> arr = new ArrayList<>();
        // while(st1.size()>0){
        //     arr.add(st1.pop());
        // }
        // // System.out.println(arr); [50, 40, 30, 20, 10]
        // while(arr.size()>0){ //O(n)
        //     st1.push(arr.remove(0)); // O(n)
        // }
        // System.out.println(st1);
        // -------------------------------------------------------------------------------

        //three stacks
        // Time Complexity  = O(n)
        // Space Complexity = O(n)
        // Stack<Integer> st2 = new Stack<>();
        // Stack<Integer> st3 = new Stack<>();
        // while(st1.size()>0)
        //     st2.push(st1.pop());
        // while(st2.size()>0)
        //     st3.push(st2.pop());
        // while(st3.size()>0)
        //     st1.push(st3.pop());
        // System.out.println(st1);
    }
}
