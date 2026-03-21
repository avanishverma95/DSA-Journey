// Problem: Remove Duplicates from Sorted List(83)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp1 != null) {

            if(temp1.val != temp2.val){
                temp2.next = temp1;
                temp2 = temp2.next;
            }

            temp1 = temp1.next;
        }

        temp2.next = null;

        return head;
    }
}
