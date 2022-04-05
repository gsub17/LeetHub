// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int cand = a[0];
        int count = 1;
        
        for(int i = 1 ; i < size ; i++){
            if(count == 0){
                cand = a[i];
                count++;
            }else if(cand == a[i]){
                count++;
            }else{
                count--;
            }
        }
        float count2 = 0;
        for(int  i = 0 ; i < size ; i++){
            if(a[i] == cand){
                count2 += 1;
            }
        }
        if(count2 > size/2){
            return cand;
        }
        return -1;
    }
}