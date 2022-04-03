// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> ans = new ArrayList<>();
        String emp = "";
        ans = subset(s ,emp ,ans);
        Collections.sort(ans);
        ans.remove(0);
        return ans;
    }
    
    public List<String> subset(String s , String emp , List<String> ans){
        if(s.length() == 0){
            ans.add(emp);
            return ans;
        }
        
        char char_at_0 = s.charAt(0);
        String left = s.substring(1);
        
        subset(left , emp+char_at_0 , ans);
        subset(left , emp , ans);
        return ans;
    }
}