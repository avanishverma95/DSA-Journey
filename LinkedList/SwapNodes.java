// LeetCode Problem: Swapping Nodes in a Linked List(1721)

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        for(int i = 1 ; i < k ; i++){

            fast =  fast.next;
        }

        ListNode left = fast;

        while(fast.next != null){
             
            fast = fast.next; 
            slow = slow.next;
        } 

        int temp = left.val;
        left.val = slow.val;
        slow.val = temp;

        return head;
    }
}
