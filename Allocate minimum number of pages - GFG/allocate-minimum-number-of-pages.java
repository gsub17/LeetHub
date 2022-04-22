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
        int min = 0 , max = 0;
        for(int i = 0 ; i<N;i++){
            max += A[i];
            if(A[i] > min){
                min = A[i];
            }
        }
        int res = 0;
        while(min <= max){
            int mid = (min+max)/2;
            if(isFeasible(A , mid , M)){
                res = mid;
                max = mid - 1;
            }else{
                min = mid +1;
            }
            
        }
        return res;
        
    }
    
    public static boolean isFeasible(int[] A , int mid ,int M){
        int sum = 0 , book = 1;
        for(int i = 0 ; i < A.length ; i++){
        if(sum + A[i] > mid){
            sum = A[i];
            book++;
        }else{
            sum+= A[i];
        }
        }
        
        if(book <= M){
            return true;
        }
        return false;
    }
};