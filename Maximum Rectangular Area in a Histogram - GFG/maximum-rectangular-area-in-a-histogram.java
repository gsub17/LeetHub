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
        
        int[] prev_smaller = new int[hist.length];
        Stack<Integer> s1 = new Stack<>();
        
        int index = 0;
        
        for(int i = 0 ; i < hist.length ;i++){
            while( !s1.isEmpty() && hist[s1.peek()] >=  hist[i]){
                s1.pop();
            }
            
            if(s1.isEmpty()){
                prev_smaller[index] = -1;
            }else{
                prev_smaller[index] = s1.peek();
            }
            
            index++;
            s1.push(i);
        }
        
        int[] next_smaller = new int[hist.length];
        Stack<Integer> s2 = new Stack<>();
        index = hist.length - 1;
        
        for(int i = hist.length -1 ; i >= 0 ; i--){
            while(!s2.isEmpty() && hist[s2.peek()] >= hist[i]){
                s2.pop();
            }
            
            if(s2.isEmpty()){
                next_smaller[index] = hist.length;
            }else{
                next_smaller[index] = s2.peek();
            }
         //   System.out.println(next_smaller[index]);
            index--;
            s2.push(i);
        }
        
     
        long ans = 0;
        for(int i = 0 ; i < hist.length ; i++){
            long temp = (next_smaller[i] - prev_smaller[i] - 1)*hist[i];
            ans = Math.max(temp , ans);
        }
        return ans;
        
        
    }
        
}



