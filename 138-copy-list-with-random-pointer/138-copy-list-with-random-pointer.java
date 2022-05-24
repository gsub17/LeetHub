/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        // create node in btw of the original
        
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }
        
        // fixing the random pointer of the  linked list
        curr = head;
        while(curr != null){
            if(curr.next != null){
                curr.next.random = (curr.random != null) ? curr.random.next : null;
            }
            curr = curr.next.next;
        }
        
        // separating the link
        Node original = head;
        Node copy = head.next;
        Node temp = copy;
        
        while(original != null){
            original.next = original.next.next;
            copy.next = (copy.next != null) ? copy.next.next : null;
            copy = copy.next;
            original = original.next;
        }
        return temp;
    }
}