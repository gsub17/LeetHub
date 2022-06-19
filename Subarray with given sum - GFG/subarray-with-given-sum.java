// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int currsum = 0;
        int start = 0;
        int end = -1;
        
        for(int i = 0 ; i < n ;i++){
            currsum += arr[i];
            
            if(currsum == s){
                start = 1;
                end = i+1;
                ans.add(start);
                ans.add(end);
                return ans;
            }
            
            if(map.containsKey(currsum - s)){
                start = map.get(currsum - s) + 1;
                end = i;
                ans.add(start+1);
                ans.add(end+1);
                return ans;
            }
            
            if(!map.containsKey(currsum - s)){
                map.put(currsum , i);
            }
            
            
        }
        ans.add(-1);
        return ans;
    }
}