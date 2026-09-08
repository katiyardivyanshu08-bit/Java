class Stack{
  private int[] arr ;
  private int top;
  private int capacity;

  Stack(int capacity){
    this.capacity=capacity;
    arr = new int[capacity];
  }
  public void push(int val){
    if(top==capacity){
      System.out.println("Stack overflow")
        return ;
    }
    arr[top++]=val;
  }
  int pop(){
    if(top==-1){
      System.out.println("Stack underflow");
      return -1;
    }
    return arr[top--];
  }
  
}
