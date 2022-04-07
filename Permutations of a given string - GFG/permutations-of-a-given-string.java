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
        int i = 0;
        int j = S.length()-1;
        permutation(S , i , j, ans);
        Collections.sort(ans);
        return ans;
    }
    
    public void permutation(String s , int left , int right ,List<String> ans){
        if(left == right){
            ans.add(s);
            return ;
        }
        
        for(int i =left ; i <= right ;i++){
            String so = swap(s , left , i);
            permutation(so , left + 1 , right , ans);
        }
        return;
    }
    
    public String swap(String s , int i , int j){
        char temp;
        char[] arr = s.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        String p = String.valueOf(arr);
        return p;
        
    }
}