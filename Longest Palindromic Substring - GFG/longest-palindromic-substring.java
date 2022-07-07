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
        int ans = 0;
        String p = "";
        for(int i = 0 ; i < S.length() ;i++){
            for(int j = i+1 ; j <= S.length() ;j++){
                String temp = S.substring(i,j);
                int x = 0;
                int y = temp.length() -1;
                boolean check = true;
                while(x <= y){
                    if(temp.charAt(x) != temp.charAt(y)){
                        check = false;
                        break;
                    }
                    x++;
                    y--;
                }
                
                if(check){
                    if(temp.length() > ans){
                        ans = temp.length();
                        p = temp;
                    }
                }
            }
        }
        return p;
    }
}