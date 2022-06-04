/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode med = median(head);
        ListNode rev = reverse(med);
        
        ListNode curr = head;
        while(curr != null && rev != null){
            if(curr.val != rev.val){
                return false;
            }
            
            curr = curr.next;
            rev = rev.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode x){
       ListNode curr = x;
        ListNode prev = null;
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    public ListNode median(ListNode x){
        ListNode slow = x;
        ListNode fast = x;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}