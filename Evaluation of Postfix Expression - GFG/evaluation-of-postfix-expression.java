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
        
        for(int i = 0 ; i < arr.length ;i++){
            char x1 = arr[i];
            if(Character.isDigit(x1)){
                s.push(x1 - '0');
            }else{
                if(x1 == '+'){
                    int x = s.pop();
                    int y = s.pop();
                    int z = x+y;
                    s.push(z);
                }else if(x1 == '-'){
                     int x = s.pop();
                    int y = s.pop();
                    int z = y-x;
                    s.push(z);
                    
                }else if(x1 == '/'){
                     int x = s.pop();
                    int y = s.pop();
                    int z = y/x;
                    s.push(z);
                    
                }else if(x1 == '*'){
                     int x = s.pop();
                    int y = s.pop();
                    int z = x*y;
                    s.push(z);
                    
                }
            }
        }
        return s.pop();
        
    }
}