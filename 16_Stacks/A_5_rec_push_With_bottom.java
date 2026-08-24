import java.util.*;
public class A_5_rec_push_With_bottom{
    static void addBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        addBottom(st,x);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println("Before: "+st1);
        addBottom(st1,50);
        System.out.println("After: "+st1);
    }
}