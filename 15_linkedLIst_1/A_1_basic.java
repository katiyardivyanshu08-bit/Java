//     Array
// │
// ├── Fast Access ✅
// ├── Fixed Size
// ├── Less Memory
// └── Slow Insert/Delete

// Linked List
// │
// ├── Slow Access
// ├── Dynamic Size ✅
// ├── Extra Memory
// └── Fast Insert/Delete

// | Feature               | Array      | ArrayList  | LinkedList     |
// | --------------------- | ---------- | ---------- | -------------- |
// | Size                  | Fixed      | Dynamic    | Dynamic        |
// | Memory                | Continuous | Continuous | Non-continuous |
// | Access by Index       | O(1)       | O(1)       | O(n)           |
// | Insert/Delete Middle  | O(n)       | O(n)       | O(1)*          |
// | Uses Array Internally | ❌          | ✅       | ❌            |

// null means this node is not connected to any next node because its next reference points to nothing." ✅
// st->head and last->tail

// Limition and pro
// Access           O(n)
// Search           O(n)
// Traversal        O(n)

// Insert Head      O(1)
// Delete Head      O(1)

// Insert Tail
// (with tail)      O(1)
// (without tail)   O(n)

// Delete Tail      O(n)

// Reverse
// Iterative        O(n), AC = O(1)
// Recursive        O(n), AC = O(n)


class Node {
        int val;
        Node next; // null

        Node(int val) {
            this.val = val;
        }
}
public class A_1_basic {
    public static void main(String[] args) {
         // 10->20->30->40->50
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

        // System.out.println(a);          //→ Node@xxxx (default object representation)
        // System.out.println(a.val);      //→ 10
        // System.out.println(a.next);     //→ Node@yyyy (or null if not connected)
        // System.out.println(a.next.val); //→ 20 (a.next==b then b.val)

        System.out.println(c.val);                 // cvalue
        System.out.println(a.next.next.next.val); // dvalue

        System.out.println(c);          //A_1_basic$Node@7ad041f3
        System.out.println(b.next);     //A_1_basic$Node@7ad041f3
        System.out.println(a.next.next);//A_1_basic$Node@7ad041f3
    }
}
