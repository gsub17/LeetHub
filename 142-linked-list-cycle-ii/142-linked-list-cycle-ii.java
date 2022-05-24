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
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;
        
        while(curr != null){
            if(set.contains(curr.next)){
               break;
            }else{
                set.add(curr);
                curr = curr.next;
            }
        }
        if(curr != null && curr.next != null){
            return curr.next;
        }
        return null;
     
    }
}