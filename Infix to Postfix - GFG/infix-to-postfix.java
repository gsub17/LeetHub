// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> s = new Stack<>();
        String ans = "";
        
        for(int i = 0 ; i < exp.length() ; i++){
            char x = exp.charAt(i);
            
            if(Character.isLetterOrDigit(x)){
                ans+=x;
            }else if(x  == '('){
                s.push(x);
            }else if(x == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    ans+=s.pop();
                }
                s.pop();
            }else{
                while(!s.isEmpty() && precedence(x) <= precedence(s.peek())){
                    ans+=s.pop();
                }
                s.push(x);
            }
        }
        
        while(!s.isEmpty()){
            ans+=s.pop();
        }
        return ans;
        
    }
    
    public static int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}