// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        // to evaluate postfix we will use stack to store operand
        
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < S.length() ; i++){
            char c = S.charAt(i);
            if(Character.isDigit(c)){
                int x = c - '0';
                s.push(x);
            }else{
                if(c == '*'){
                    int x2 = s.pop();
                    int x1 = s.pop();
                    s.push(x1 * x2);
                }else if(c == '/'){
                    int x2 = s.pop();
                    int x1 = s.pop();
                    s.push(x1 / x2);
                }else if(c == '+'){
                    int x2 = s.pop();
                    int x1 = s.pop();
                    s.push(x1 + x2);
                }else{
                    int x2 = s.pop();
                    int x1 = s.pop();
                    s.push(x1 - x2);
                }
            }
        }
        
        return s.pop();
        
    }
}