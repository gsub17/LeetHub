// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}


            

// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int curr_sum = 0;
        int start = 0;
        int end = -1;
        int ans = 0;
        
        for(int i = 0 ; i < A.length ; i++){
            curr_sum += A[i];
            
            if(curr_sum == K){
                start = 0;
                end = i;
                ans = Math.max(ans , end - start + 1);
            }
            
            if(map.containsKey(curr_sum - K)){
                start = map.get(curr_sum - K)+1;
                end = i;
                ans = Math.max(ans , end - start + 1); 
            }
            
            if(!map.containsKey(curr_sum)){
                map.put(curr_sum , i);
            }
        }
        
        if(end == - 1){
            return 0;
        }
        return ans;
    }
    
    
}


