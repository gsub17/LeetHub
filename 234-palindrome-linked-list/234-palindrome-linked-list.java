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
        ListNode curr = head;
        
        ListNode mid = middle(curr);
        ListNode rev = reverse(mid);
        
        while(curr != null && rev != null){
            if(curr.val == rev.val){
                curr = curr.next;
                rev = rev.next;
            }else{
                return false;
            }
        }
        return true;
    }
    
    public ListNode reverse(ListNode mid){
        ListNode curr = mid;
        ListNode prev = null;
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
    
    public ListNode middle(ListNode curr){
        ListNode slow = curr;
        ListNode fast = curr;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}