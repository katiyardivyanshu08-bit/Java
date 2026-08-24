// Main Difference:
// Array → Access elements using an index.
// Stack → Access elements only from the top using LIFO.

// Important:
// Array describes how data is stored and accessed by index, 
// while Stack describes how data should be accessed (LIFO).

// Real-world uses of Stack:
// Undo/Redo, Browser Back button, Function Calls, Recursion, DFS, Backtracking,
//  Bracket Matching, andExpression Evaluation.

import java.util.*;
public class A_1_basic {
    public static void main(String[] args){
        Stack<String> st = new Stack<>();

        // System.out.println(st.isEmpty()); //true
        // //or
        // System.out.println(st.size()==0); //true

        // System.out.println(st.peek());
        // st.pop(); // Underflow

        st.push("Khushi");  // <---------------bottom element
        st.push("Preet");
        st.push("Rishika");
        st.push("Isha");
        st.push("Prayas");  // <---------------top element

        System.out.println(st.size());
        System.out.println(st); // A.S. = O(n)

        st.pop();
        System.out.println(st + " " + st.size());

        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost element and then removes it

        System.out.println(st);
        
        String s = st.pop();
        System.out.println(s);

        System.out.println(st);
    }
}
