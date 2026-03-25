// Problem: Partition List
// LeetCode: 86


class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head == null || head.next == null) return head;

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode list1 = dummy1;
        ListNode list2 = dummy2;
        ListNode temp = head;

        while(temp != null){

            if(temp.val < x){

                list1.next = temp;
                list1 = list1.next;
            }
            else{

                list2.next = temp;
                list2 = list2.next;
            }

            temp = temp.next;

        }

        list1.next = dummy2.next;
        list2.next = null;

        return dummy1.next;

    }
}
