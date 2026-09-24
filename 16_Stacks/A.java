class stack{
    int [] arr ;
    int top;
    int capacity;

    stack(int capacity){
        top=-1;
        this.capacity=capacity;
        arr=new int [capacity];
    }
    void push(int a){
        if(top==capacity-1){
            System.out.print("Stack over flow");
            return ;
        }
        arr[++top]=a;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack under flow");
            return -1;
        }
        return arr[top--];
    }
    int cap(){
        return  capacity;
    }
    int size(){
        return top+1;
    }
}
class A {
    public static void main(String[] args) {
        stack st=new stack(5);
        st.push(1);
        st.push(3);
        st.push(234567);
        System.out.println(st.pop());
        System.out.println(st.search(3));
    }
}