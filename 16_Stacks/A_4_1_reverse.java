// Time Complexity: O(n²)
// Space Complexity: O(n)
import java.util.*;
public class A_4_1_reverse{
    static void reverse(Stack<Integer> st){
        if(st.size()==0) return;
        int x=st.pop();
        reverse(st);
        addBottom(st,x);
    }
  static void addBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int y=st.pop();
        addBottom(st,x);
        st.push(y);
    }
 public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        System.out.println("Before: "+st1);
        reverse(st1);
        System.out.println("After: "+st1);
    }
}

// [10, 20, 30, 40, 50]
// pop 50
// pop 40
// pop 30
// pop 20
// pop 10

// reverse empty stack

// add 10 at bottom
// add 20 at bottom
// add 30 at bottom
// add 40 at bottom
// add 50 at bottom

// [50, 40, 30, 20, 10]
