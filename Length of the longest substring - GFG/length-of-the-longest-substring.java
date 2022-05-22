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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        int i = 0 , max = 0 , j = 0;
        HashSet<Character> set = new HashSet<>();
        
        while(i < S.length()){
            if(!set.contains(S.charAt(i))){
                set.add(S.charAt(i));
                max = Math.max(max , set.size());
                i++;
            }else{
                set.remove(S.charAt(j));
                j++;
            }
        }
        return max;
    }
}