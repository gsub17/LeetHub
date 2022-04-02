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
        int n = S.length() - 1;
        ans = permutation(S,0,n,ans);
        Collections.sort(ans);
        return ans;
    }
    
    public  List<String> permutation(String s , int left , int right , List<String> ans) {
		if(left == right) {
			ans.add(s);
			return ans;
		}else {
			for(int i = left ; i <= right ; i++) {
				String swapped= swap(s , left , i);
				permutation(swapped , left+1 , right , ans);
			}
		}
		return ans;
	}
	
	public String swap(String s , int i ,int j) {
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
		
	}
}