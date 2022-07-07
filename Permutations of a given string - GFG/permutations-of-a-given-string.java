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
        permute(S , ans , 0 , S.length() -1);
        HashSet<String> set = new HashSet<>();
        for(String i:ans){
            set.add(i);
        }
        
        ans = new ArrayList<>();
        for(String i:set){
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
    
    public void permute(String S , List<String> ans , int s , int e){
        if(s == e){
            ans.add(S);
            return;
        }
        
        for(int i = s ; i <= e ;i++ ){
            String new_S = swap(S , i , s);
            permute(new_S , ans , s+1 , e);
            String new_St = swap(S , i , s);
        }
        return;
    }
    
    public String swap(String S , int i , int j){
        char[] arr = S.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        String p = String.valueOf(arr);
        return p;
    }
}