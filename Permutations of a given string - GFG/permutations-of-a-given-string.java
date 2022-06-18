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
        ans = permute(S , 0 , S.length() -1 , ans);
        HashSet<String> set = new HashSet<>();
        for(String a:ans){
            set.add(a);
        }
        List<String> ans2 = new ArrayList<>();
        for(String a:set){
            ans2.add(a);
        }
        Collections.sort(ans2);
        return ans2;
    }
    
    public List<String> permute(String S , int s , int e , List<String> ans){
        if(s == e){
            ans.add(S);
            return ans;
        }
        
        for(int i = s ; i <= e ;i++){
            String l1 = swap(S , s , i);
            permute(l1 , s+1 , e , ans);
            String l2 = swap(S , s , i);
        }
        return ans;
        
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