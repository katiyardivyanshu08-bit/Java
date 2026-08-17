// class A_4_Middle{

//         // slow fast approch

//     // Middle (if  list is even -> right middle)
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast != null && fast.next != null){
//             // (fast.next!=null && fast!=null) 
//             // wrong because -> even(null ka next nahi hota)
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//        // left Middle
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast.next!= null && fast.next.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
         
        // // Not a ONE PASS solution
        // int length = 0;
        // Node temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     length++;
        // }
        // temp = head;
        // for(int i=1;i<=length/2;i++){
        //     temp = temp.next;
        // }
        // return temp.data;
//     }
// }
