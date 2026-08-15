class Solution {
    public ListNode mergeLists(ListNode head1, ListNode head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        ListNode temp = head1;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head2;
        return head1;
    }
}