// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String S){
        // code here
        int max = 0;
        String ans = "";
        
        for(int i = 0 ; i < S.length() ; i++){
            for(int j = i+1 ; j <= S.length() ; j++){
                String temp = S.substring(i , j);
                int p = 0;
                int q = temp.length()-1;
                boolean check = true;
                while(p < q){
                    if(temp.charAt(p) != temp.charAt(q)){
                        check = false;
                        break;
                    }
                    p++;
                    q--;
                }
                if(check){
                    if(max < temp.length()){
                        ans = temp;
                        max = temp.length();
                    }
                }
            }
        }
        return ans;
    }
}