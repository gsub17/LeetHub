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
    static ArrayList<Integer> subarraySum(int[] arr, int n, int k) 
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int start = 0;
        int end = -1;
        
        for(int i = 0 ; i < n;i++){
            sum+=arr[i];
            if(sum == k){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(sum-k)){
                start = map.get(sum-k)+1; // add 1 imp
                end = i;
                break;
            }
            map.put(sum , i);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(end == -1){
            ans.add(-1);
            return ans;
        }
        ans.add(start+1);
        ans.add(end+1);
        return ans;
    }
}