// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int height[], int n) { 
        // Your code here
    
        int[] left_aux = new int[n];
        left_aux[0] = height[0];
        for(int i = 1 ; i < n ; i++){
            left_aux[i] = Math.max(left_aux[i-1] , height[i]);
        }
        
        int[] right_aux = new int[n];
        right_aux[n-1] = height[n-1];
         for(int i = n-2 ; i >= 0 ; i--){
            right_aux[i] = Math.max(right_aux[i+1] , height[i]);
        }
        
        long water = 0;
        for(int i = 0 ; i < n;i++){
            water+= (Math.min(left_aux[i],right_aux[i]) - height[i]);
        }
        return water;
    } 
}


