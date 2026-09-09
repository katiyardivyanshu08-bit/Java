class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    void push(int value){
        if(top == capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = value; 
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    int size() {
        return top+1;
    }

    int cap(){
        return capacity;
    }

}

class Main {
    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        s1.push(67);
        s1.push(56);
        s1.push(46);
        s1.push(156);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
    }
}
