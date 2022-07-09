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
        Stack<Integer> s = new Stack<>();
        char[] arr = S.toCharArray();
        
        int ans = 0;
        for(char i:arr){
            if(Character.isDigit(i)){
                int x = i - '0';
                s.push(x);
            }else{
                int n2 = s.pop() ;
                int n1 = s.pop();
                if(i == '+'){
                    n2 = n2 + n1;
                    s.push(n2);
                }else if(i == '-'){
                    n2 = n1 - n2;
                    s.push(n2);
                }else if(i == '/'){
                    n2 = n1/n2;
                    s.push(n2);
                }else{
                    n2 = n1*n2;
                    s.push(n2);
                }
            }
        }
        
        return s.peek();
    }
}