import java.util.*;
public class A_3_get_add_remove_any_idx {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        int idx = 2;
        
        // get and pop code same 
        while(st1.size()>idx+1){
            st2.push(st1.pop());
        }
        System.out.println("Get element in idx 2 : "+st1.peek());
        // again make same 
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        System.out.println(st1);
        
// -------------------------------------------------------------------------------------        
        // add
        while(st1.size()>idx){
            st2.push(st1.pop());
        }
        st1.push(800);
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        System.out.println(st1);

// -----------------------------------------------------------------------------------------        
        //pop
        while(st1.size()>idx+1){
            st2.push(st1.pop());
        }
        st1.pop();
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        System.out.println(st1);

    }
}
