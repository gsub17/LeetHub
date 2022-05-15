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
    public static int lenOfLongSubarr (int A[], int N, int k) {
        //Complete the function
        int start = 0;
        int end = -1;
        int len = 0;
        int currsum =0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ;i < N;i++){
            currsum += A[i];
            if(currsum == k){
                start = 0;
                end = i;
                len = Math.max(end-start+1 , len);
            }
            if(map.containsKey(currsum - k)){
                start = map.getOrDefault(currsum-k , 0) + 1;
                end = i;
                len = Math.max(end - start +1 , len);
            }
             //if we get two same keys with different values
            if(map.containsKey(currsum)){
                map.getOrDefault(currsum ,0);
            }else{
                map.put(currsum , i);
            }
            
        }
        return len;

    }
    
    
}


