// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> pattern(int N){
        // code here
        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();
        n1 = generate1(N , n1);
        int x = n1.size();
        int p = n1.get(x-1);
        if(p > 0){
            n1.add(p-5);
            n1 = generate2(N , p-5 , n1);
        }else{
             n1 = generate2(N , p , n1);
        }
     
        return n1;
    }
    
    public static List<Integer> generate1(int N , List<Integer> n1){
        if(N < 0){
            return n1;
        }
        n1.add(N);
        generate1(N-5 , n1);
        return n1;
    }
    
    public static List<Integer> generate2(int N , int N2 , List<Integer> n1){
        if(N2 == N){
            return n1;
        }
        n1.add(N2+5);
        generate2(N,N2+5 , n1);
        return n1;
    }
    
    
}