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
        int x = 0;
        int y = 0;
        
        while(curr1 != null || curr2 != null){
            
            if(curr1 != null){
                x = curr1.val;
            }else{
                x = 0;
            }
          
         if(curr2 != null){
             y = curr2.val;
         }else{
             y = 0;
         }
            
            sum = carry + x + y;
            carry = sum/10;
            
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            
            curr1 = (curr1 != null) ? curr1.next : null;
            curr2 = (curr2 != null) ?   curr2.next :  null;
            
            
            
        }
        if(carry > 0){
            temp.next = new ListNode(carry);
        }
        return ans.next;
    }
}