// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    // code here
	    int low = 0 , high = array.length -1;
	    int x = -20;
	    while(low <= high){
	        int mid = (low+high)/2;
	        if(array[mid] == target){
	            x = mid;
	            return x;
	        }
	        if(array[low] < array[mid]){
	            if(target >= array[low] && target < array[mid]){
	                high = mid - 1;
	            }else{
	                low = mid + 1;
	            }
	        }else{
	            if(target > array[mid] && target <= array[high]){
	                low = mid + 1;
	            }else{
	                high = mid - 1;
	            } 
	        }
	        
	    }
	    if(x != -20){
	        return x;
	    }
	    
	    return -1;
	}
} 

