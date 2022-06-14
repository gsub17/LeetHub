// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // Complete this function
       int i = 0;
       int j = A.length - 1;
       
       while(i <= j){
           int mid = (i+j)/2;
           
           if(A[mid] == key) return mid;
           
           if(A[mid] >= A[i]){
               if(A[mid] > key && A[i] <= key){
                   j = mid - 1;
               }else{
                   i = mid + 1;
               }
           }else{
               if(A[mid] < key && A[j] >= key){
                   i = mid + 1;
               }else{
                   j = mid - 1;
               }
           }
       }
       return -1;
    }
}