// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<>();
        ans = permutation(S , 0 , S.length()-1 , ans);
        Collections.sort(ans);
        return ans;
    }
    
    public List<String> permutation(String s , int left , int right , List<String> ans ){
        if(left == right){
            ans.add(s);
            return ans;
        }
        
        for(int i = left ; i <= right ; i++){
            String swab = swap(s , left , i);
            permutation(swab , left+1 , right , ans);
            String swab2 = swap(s , left , i);
        }
        return ans;
    }
    
    public String swap(String s , int i , int j){
        char temp;
        char[] s2 = s.toCharArray();
        temp = s2[i];
        s2[i] = s2[j];
        s2[j] = temp;
        String p = String.valueOf(s2);
        return p;
    }
}