// class Solution{
//     void reverseList(Node head){
//         Node prev=null,curr=head,fwd=null;
//         while(curr!=null){
//             fwd=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=fwd;
//         }
//     }
//    Node reverse(Node head){
//         Node tail=head;
//         while(tail.next!=head) tail=tail.next;
//         tail.next=null;
//         reverseList(head);
//         head.next=tail;
//         return tail;
//     }
  
//     // remove k
//     Node deleteNode(Node head,int key){
//         if(head==null) return null
          
//         Node tail=head;
//         while(tail.next!=head) tail=tail.next;
//         tail.next=null;
      
//         if(head.data==key){
//             head=head.next;
//             tail.next=head;
//             return head;
//         }
      
//         Node temp=head,temp2=head.next;
//         while(temp2!=null){
//             if(temp2.data==key){
//                 temp.next=temp2.next;
//                 break;
//             }
//             temp=temp2;
//             temp2=temp2.next;
//         }
//         tail.next=head;
//         return head;
//     }
// }
