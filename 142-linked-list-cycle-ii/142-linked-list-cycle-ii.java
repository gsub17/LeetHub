/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meet = detect(head);
        if(meet == null){
            return null;
        }
        
        ListNode start = head;
        while(start != meet){
            start = start.next;
            meet = meet.next;
        }
        return start;
    }
    
    public ListNode detect(ListNode x){
        ListNode slow = x;
        ListNode fast = x;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
}