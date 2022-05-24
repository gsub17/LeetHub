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
        Node n1 = reverse(first);
        Node n2 = reverse(second);
        Node ans = new Node(0);
        Node temp  = ans;
        int sum = 0;
        int carry = 0;
        while(n1 != null || n2 != null){
            int x = (n1 != null) ? n1.data : 0;
            int y = (n2 != null) ? n2.data : 0;
            
            sum = x+y+carry;
            carry = sum/10;
            temp.next = new Node(sum%10);
            temp = temp.next;
           
            if(n1 != null) n1 = n1.next;
            if(n2 != null) n2 = n2.next;
        }
        if(carry > 0){
            temp.next = new Node(carry);
        }
        ans  = ans.next;
        ans = reverse(ans);
        return ans;
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