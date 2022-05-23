import java.util.*;
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
        ListNode curr = head;
        HashSet<ListNode> set =new  HashSet<>();
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