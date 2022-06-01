// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
        String ans = "";
        Stack<Character> s = new Stack<>();
        
        for(int i = 0 ; i < S.length() ; i++){
            
            char temp = S.charAt(i);
            if(Character.isLetterOrDigit(temp)){
                s.push(temp);
            }else{
                while(!s.isEmpty()){
                    ans+=s.pop();
                }
                 ans+='.';
            }
            
        }
        
         while(!s.isEmpty()){
                    ans+=s.pop();
                }
        return ans;
        
    }
}