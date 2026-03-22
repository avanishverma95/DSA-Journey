// Problem: Remove Linked List Elements(203)

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
             ListNode dummy = new ListNode(-1);
             ListNode res = dummy;
             ListNode temp = head;
             
             while(temp != null){

                if(temp.val == val){

                    temp = temp.next;
                }
                else{

                    dummy.next = temp;
                    dummy = dummy.next;
                    temp = temp.next;
                }
             } 
           dummy.next = null;

           return res.next; 
     }
        
}
