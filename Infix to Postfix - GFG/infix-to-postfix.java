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
        String ans = "";
        char[] arr = exp.toCharArray();
        Stack<Character> s = new Stack<>();
        
        for(int i = 0 ; i < exp.length() ; i++){
            char c = arr[i];
            
            if(Character.isLetterOrDigit(c)){
                ans+=c;
            }else{
                if(c == '('){
                    s.push(c);
                }else if(c == ')'){
                    while(!s.isEmpty() && s.peek() != '('){
                        ans += s.pop();
                    }
                    s.pop();
                }else{
                    while(!s.isEmpty() && priority(s.peek()) >= priority(c)){
                        ans += s.pop();
                    }
                    s.push(c);
                }
            }
        }
        while(!s.isEmpty()){
            ans += s.pop();
        }
        return ans;
    }
    
    public static int priority(char c){
        switch(c){
            case'+':
            case'-':
                return 1;
            case'/':
            case'*':
                return 2;
            case'^':
                return 3;
        }
        return -1;
    }
}