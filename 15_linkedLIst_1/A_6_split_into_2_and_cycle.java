class Solution{
    // cyclic linklist
    public void split(ListNode head){
        if(head==null || head.next==null) return;
        ListNode t=head;
        ListNode slow=head;
        ListNode fast=head;
        while(t.next!=head){
            t=t.next;
        }
        t.next=null; //singly linklist
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode head2=slow.next;
        slow.next=head;
      
        t.next=head2;

        //print -> slow.next and t.next
    }
}
