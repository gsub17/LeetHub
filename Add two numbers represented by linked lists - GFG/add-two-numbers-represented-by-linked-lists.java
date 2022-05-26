// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node f1 = reverse(first);
        Node f2 = reverse(second);
        
        Node ans = new Node(0);
        Node temp = ans;
        
        int sum = 0 , carry = 0;
        
        while(f1 != null || f2 != null){
            int x = (f1 != null) ? f1.data : 0;
            int y = (f2 != null) ? f2.data : 0;
            
            sum = x + y + carry;
            carry = sum / 10;
            
            ans.next = new Node(sum%10);
            f1 = (f1 != null) ? f1.next : null;
            f2 = (f2 != null) ? f2.next : null;
            ans = ans.next;
        }
        if(carry > 0){
            ans.next = new Node(carry);
        }
        
        temp = reverse(temp.next);
        return temp;
        
    }
    
    static Node reverse(Node x){
        Node curr = x;
        Node prev = null;
        
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}