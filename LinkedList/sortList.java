// Problem: Sort List
// LeetCode: 148

class Solution {
 
    private ListNode findMid(ListNode head){

        ListNode slow = head;
        ListNode fast = slow.next;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
 
    private ListNode merge(ListNode l1 , ListNode l2){

        ListNode dummy = new ListNode(-1);
        ListNode res  = dummy;
         
         while(l1 != null && l2 != null){

            if(l1.val <= l2.val){

                dummy.next = l1;
                l1 = l1.next;
               
            }
            else{

                dummy.next = l2;
                l2 = l2.next;
            }
           
              dummy = dummy.next;
         }

         if(l1 != null) dummy.next = l1;
         else dummy.next = l2;
        
        return res.next;
    }

    public ListNode sortList(ListNode head) {
        
        if(head ==null || head.next == null) return head;

        ListNode mid = findMid(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
                right = sortList(right);

        return merge(left , right);
    }
}
