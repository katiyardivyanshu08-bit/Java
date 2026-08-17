class A_4_Middle{
        // slow fast approch
  
    // Middle (if  list is even -> right middle)
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            // (fast.next!=null && fast!=null) 
            // wrong because -> even(null ka next nahi hota)
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        
       // left Middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode left = null;
        while(fast != null && fast.next != null){
            left = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // right middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
             slow = slow.next;
            fast = fast.next.next;
        }
         ListNode right = slow.next; 

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
    }
}
