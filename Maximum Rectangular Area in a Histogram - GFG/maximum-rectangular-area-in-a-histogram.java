// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        Stack<Integer> s1 = new Stack<>();
        long[] prev_smaller = new long[hist.length];
        prev_smaller[0] = -1;
        s1.push(0);
        for(int i = 1 ; i< hist.length ;i++){
            while(!s1.isEmpty() && hist[s1.peek()] >= hist[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                prev_smaller[i] = -1;
            }else{
                prev_smaller[i] = s1.peek();
            }
            s1.push(i);
        }
        
        Stack<Integer> s2 = new Stack<>();
        long[] next_smaller = new long[hist.length];
        next_smaller[hist.length -1 ] = hist.length;
        s2.push(hist.length - 1);
        
        for(int i = hist.length - 2 ; i >= 0 ;i--){
            while(!s2.isEmpty() && hist[s2.peek()] >= hist[i]){
                s2.pop();
            }
            if(s2.isEmpty()){
                next_smaller[i] = hist.length;
            }else{
                next_smaller[i] = s2.peek();
            }
            s2.push(i);
        }
       
        long ans = 0;
        for(int i = 0 ; i < hist.length ;i++){
            ans = Math.max(ans , (next_smaller[i] - prev_smaller[i]-1 ) * hist[i]);
        }
        return ans;
    }
        
}



