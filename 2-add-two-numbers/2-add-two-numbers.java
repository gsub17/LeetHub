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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int sum = 0;
        int carry = 0;
        
        while(curr1 != null || curr2 != null){
            int x  = (curr1 != null ) ? curr1.val : 0;
            int y = (curr2 != null) ? curr2.val : 0;
            
            sum = x+y+carry;
            carry = sum/10;
            ans.next = new ListNode(sum%10);
            curr1 = (curr1 != null) ? curr1.next : null;
            curr2 = (curr2 != null) ? curr2.next : null;
            ans = ans.next;
        }
        if(carry > 0){
            ans.next = new ListNode(carry);
        }
        return temp.next;
    }
}