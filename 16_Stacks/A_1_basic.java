// Main Difference:
// Array → Access elements using an index.
// Stack → Access elements only from the top using LIFO.

// Important:
// Array describes how data is stored and accessed by index, 
// while Stack describes how data should be accessed (LIFO).

// Real-world uses of Stack:
// Undo/Redo, Browser Back button, Function Calls, Recursion, DFS, Backtracking,
//  Bracket Matching, andExpression Evaluation.

//------------------------------------------------------------------------------------------
// monotonic STack -> Monotonic Stack We maintain an order (decreasing and increasing).

// 1. Next Greater Element
//         ↓
// 2. Next Smaller Element
//         ↓
// 3. Previous Greater/Smaller
//         ↓
// 4. Stock Span
//         ↓
// 5. Daily Temperatures
//         ↓
// 6. Largest Rectangle in Histogram
// Without a monotonic stack, many of these can take O(n²).
// With it, they can usually be solved in O(n).

// | Problem            | What are we looking for? | Stack idea |
// | ------------------ | ------------------------ | ---------- |
// | Next Greater       | Greater on right         | Decreasing |
// | Next Smaller       | Smaller on right         | Increasing |
// | Previous Greater   | Greater on left          | Decreasing |
// | Previous Smaller   | Smaller on left          | Increasing |
// | Stock Span         | Previous greater         | Decreasing |
// | Daily Temperatures | Warmer on right          | Decreasing |
// | Histogram          | Smaller boundaries       | Increasing |


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

        st.pop(); // in O(1) 
        System.out.println(st + " " + st.size());

        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost element and then removes it

        System.out.println(st);
        
        String s = st.pop();
        System.out.println(s);

        System.out.println(st);
    }
}
