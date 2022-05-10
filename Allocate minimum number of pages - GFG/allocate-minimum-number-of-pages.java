// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int min = 0;
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            max+= A[i];
            min = Math.max(min,A[i]);
        }
        int ans = 0;
        while(min<=max){
            int mid = (min+max)/2;
            if(isFeasible(A,mid,M)){
                ans = mid;
                max = mid - 1;
            }else{
                min = mid+1;
            }
        }
        
        if(ans == 0){
            return -1;
        }
        return ans;
    }
    
    public static boolean isFeasible(int[] A,int mid , int m){
        int sum = 0 , boy = 1;
        for(int i = 0 ; i < A.length ;i++){
            if(sum+A[i] > mid){
                sum = A[i];
                boy++;
            }else{
                sum+=A[i];
            }
        }
        if(boy <= m){
            return true;
        }
        return false;
    }
};