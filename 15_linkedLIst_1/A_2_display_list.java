class Node {
        int val;
        Node next; // null

        Node(int val) {
            this.val = val;
        }
}
public class A_2_display_list {
    public static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;                // very imp
        }
        //or
        //        for(Node temp = head;temp != null;temp = temp.next){
        //            System.out.print(temp.val+" ");
        //        }
        //        System.out.println();
    }

    private static int get(Node head, int idx) {
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public static void main(String[] args) {
        Node a = new Node(10); // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        // Connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        // display(a); // obj so it is pass by ref
        displayRec(a);
        System.out.println();
        System.out.println(get(a,4));
    }
}
