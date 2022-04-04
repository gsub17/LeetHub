// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    
     
    
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[][] board = new int[n][n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        placethequeen(board , 0 , n , ans);
        return ans;
    }
    
    
    
    public static void placethequeen(int[][] board , int cr , int queen , ArrayList<ArrayList<Integer>> ans){
        if(cr == queen){
            ArrayList<Integer> ans2 = new ArrayList<>();
            for(int i = 0 ; i < queen ; i++){
            for(int j = 0 ; j < queen ; j++){
                if(board[i][j] == 1){
                    ans2.add(j+1);
                }
            }
                
        }
            ans.add(ans2);
            return ;
            
        }
        
        for(int cc = 0 ; cc < queen ; cc++){
            if(issafe(board , cr , cc , queen )){
                board[cr][cc] = 1;
                placethequeen(board , cr+1 , queen ,ans);
                board[cr][cc] = 0;
            }
        }
        return ;
    }
    
    
     public static boolean issafe(int[][] board , int cr , int cc , int queen){
        
        for(int row = 0 ; row < queen ; row++) {
			if(board[row][cc] == 1) {
				return false;
			}
		}
        
        int row = cr;
		int col = cc;
		
		while(row >= 0 && col >= 0) {
			if(board[row][col] == 1) {
				return false;
			}
			row--;
			col--;
		}
		
		// checking right diagonal
		row = cr;
		col = cc;
		
		while(row >= 0 && col < queen) {
			if(board[row][col] == 1) {
				return false;
			}
			row--;
			col++;
		}
		
		return true;
        
    }
}