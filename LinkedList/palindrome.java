// Problem: Palindrome Linked List
// LeetCode: 234

class Solution {

    private ListNode findMid(ListNode head){

        ListNode slow = head;
        ListNode fast = slow.next;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast  = fast.next.next;
        }

        return slow;
    }
 
    private ListNode reverse(ListNode right){

        ListNode curr = right;
        ListNode prv = null;

        while(curr != null){

           ListNode next = curr.next;
            curr.next = prv;
            prv = curr;
            curr = next;
        }
        return prv;
    }
      

    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) return true;

        ListNode mid = findMid(head);
        ListNode right = mid.next;
                 mid.next = null;
        ListNode rev = reverse(right);
        
        ListNode temp = head;

        while(rev != null){

            if(temp.val != rev.val) return false;
            else{

                temp = temp.next;
                rev = rev.next;
            }
        }

        return true;
    }
}
