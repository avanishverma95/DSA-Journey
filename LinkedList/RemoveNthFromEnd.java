// LeetCode Problem: Remove Nth Node From End of List(19)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null) return null;

        ListNode temp = head;
        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(n == size) return head.next;

        temp = head;

        for(int i = 1; i < size - n; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
