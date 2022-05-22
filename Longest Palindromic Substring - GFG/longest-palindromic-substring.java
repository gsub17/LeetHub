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
     String ans = "";
     int max = 0;
     //int i = 0 , max =0 , j = 0;
     
     for(int i = 0 ; i < S.length() ; i++){
         for(int j = i+1 ; j <= S.length() ; j++){
             String z = S.substring(i,j);
             int p = 0 ;
             int q = z.length()-1;
             boolean check = false;
             while(p < q){
                 if(z.charAt(p) != z.charAt(q)){
                     check = true;
                     break;
                 }
                 p++;
                 q--;
             }
             if(!check){
                 int prev = max;
                 max = Math.max(z.length() , max);
                 if(prev < max){
                     ans = z;
                 }
             }
             
         }
     }
     return ans;
    }
}